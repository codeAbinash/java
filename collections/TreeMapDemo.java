package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
  public static void main(String[] args) {
    TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "Zero"));
    tm.put(1, "One");
    tm.put(2, "Two");
    tm.put(3, "Three");
    tm.put(4, "Four");

    System.out.println("TreeMap: " + tm);
    System.out.println("Contains key 2: " + tm.containsKey(2));
    System.out.println("Celling entry for 3: " + tm.ceilingEntry(3).getValue());
    System.out.println("Five: " + tm.get(5));
    System.out.println("First entry: " + tm.firstEntry().getValue());
    System.out.println("Last entry: " + tm.lastEntry().getValue());
    System.out.println("Higher entry for 3: " + tm.higherEntry(3).getValue());
    System.out.println("Lower entry for 3: " + tm.lowerEntry(3).getValue());
    System.out.println("Removing entry for 2: " + tm.remove(2));
    System.out.println("TreeMap after removing entry for 2: " + tm);
    System.out.println("Four: " + tm.get(4));

  }
}
