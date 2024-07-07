package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

    System.out.println("Initial list: " + list);

    list.add(6);
    list.add(7);
    list.add(8);

    System.out.println("Added elements: " + list);
  }
}
