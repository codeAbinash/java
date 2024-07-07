package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
  public static void main(String[] args) {
    LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true) {
      @Override
      protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return size() > 5;
      }
    };
    lhm.put(2, "Two");
    lhm.put(1, "One");
    lhm.put(0, "Zero");
    lhm.put(3, "Three");

    System.out.println(lhm);

    lhm.put(4, "Four");
    lhm.put(5, "Five");
    lhm.put(6, "Six");

    System.out.println(lhm);
  }
}
