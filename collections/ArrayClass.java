package collections;

import java.util.Arrays;
import java.util.Comparator;

class Compare implements Comparator<Integer> {
  public int compare(Integer a, Integer b) {
    return a - b;
  }
}

public class ArrayClass {
  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 5 };
    int b[] = { 6, 7, 8, 9, 10 };
    System.out.println(Arrays.compare(a, b));

    int c[] = Arrays.copyOf(a, a.length);
    System.out.println(Arrays.equals(a, c));

    int size = Short.MAX_VALUE;
    Integer arr[] = new Integer[size];
    for (short i = 0; i < size; i++) {
      arr[i] = Math.round((float) Math.random() * Short.MAX_VALUE);
    }
    // Sort
    Arrays.sort(arr);

    // Parallel sort
    Arrays.parallelSort(arr);

    System.out.println(Arrays.binarySearch(arr, 1000));

    Arrays.sort(arr, new Compare());
    System.out.println(Arrays.binarySearch(arr, 1000, new Compare()));

  }
}
