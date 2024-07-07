package collections;

import java.util.HashSet;

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    set.add(50);

    System.out.println("Initial set: " + set);

    set.add(60);
    set.add(70);
    set.add(80);

    System.out.println("Added elements: " + set);

    set.remove(30);
    set.remove(40);

    System.out.println("Removed elements: " + set);

    System.out.println("Contains 10: " + set.contains(10));

  }

}
