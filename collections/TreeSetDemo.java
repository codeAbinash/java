package collections;

import java.util.TreeSet;

class Point implements Comparable<Point> {
  int x, y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int compareTo(Point p) {
    return this.x - p.x;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}

public class TreeSetDemo {
  public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>();
    set.add(10);
    set.add(20);
    set.add(30);

    System.out.println("Initial set: " + set);

    set.add(50);
    set.add(15);

    System.out.println("Added elements: " + set);

    System.out.println("Ceiling of 25: " + set.ceiling(25));
    System.out.println("Floor of 25: " + set.floor(25));

    System.out.println("Higher of 25: " + set.higher(25));
    System.out.println("Lower of 25: " + set.lower(25));

    System.out.println("First element: " + set.first());
    System.out.println("Last element: " + set.last());

    System.out.println("Removing 20: " + set.remove(20));
    System.out.println("Set after removing 20: " + set);

    TreeSet<Point> pointSet = new TreeSet<>();

    pointSet.add(new Point(10, 20));
    pointSet.add(new Point(15, 25));
    pointSet.add(new Point(5, 10));
    pointSet.add(new Point(20, 30));

    System.out.println("Point set: " + pointSet);

    System.out.println("Ceiling of (12, 22): " + pointSet.ceiling(new Point(12, 22)));

  }
}
