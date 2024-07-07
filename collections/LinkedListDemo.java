package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.addAll(list2);

    System.out.println("list1: " + list1);
    System.out.println("list2: " + list2);

    System.out.println(list1.contains(1));
    System.out.println(list1.contains(11));
    System.out.println(list1.indexOf(1));
    System.out.println(list1.indexOf(11));
    System.out.println(list1.lastIndexOf(1));
    System.out.println(list1.lastIndexOf(11));
    System.out.println(list1.isEmpty());
    System.out.println(list1.size());
    System.out.println(list1.get(0));
    System.out.println(list1.get(10));
    System.out.println(list1.remove(0));
    System.out.println(list1.remove(9));
    System.out.println(list1);
    System.out.println(list1.set(0, 1));
    System.out.println(list1);
    System.out.println(list1.subList(0, 5));

    // Iterating
    for (int i = 0; i < list1.size(); i++) {
      System.out.print(list1.get(i) + " ");
    }
    System.out.println();

    for (var i : list1) {
      System.out.print(i + " ");
    }
    System.out.println();

    list1.forEach(i -> System.out.print(i + " "));
    System.out.println();

    list1.forEach(System.out::print);
    System.out.println();

    list1.forEach(ListDemo::show);
    System.out.println();

    Iterator<Integer> it = list1.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
    System.out.println();

    // Extra methods
    list1.addFirst(0);
    list1.addLast(11);
    System.out.println(list1);
  }
}
