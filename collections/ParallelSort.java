package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ParallelSort {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    int size = 20000000;
    System.out.println("Sorting 20 million random Integers...");
    System.out.println("Runtime: availableProcessors: " + Runtime.getRuntime().availableProcessors());
    for (int i = 0; i < size; i++) {
      list.add((int) (Math.random() * size));
    }

    Integer arrParallel[] = list.toArray(new Integer[0]);
    System.out.print("Parallel Sorting...\t");
    long start2 = System.currentTimeMillis();
    Arrays.parallelSort(arrParallel);
    long end2 = System.currentTimeMillis();
    System.out.println("in " + (end2 - start2) / 1000.0 + "s");

    Integer arrNorm[] = list.toArray(new Integer[0]);
    System.out.print("Normal Sorting...\t");

    long start = System.currentTimeMillis();
    Arrays.sort(arrNorm);
    long end = System.currentTimeMillis();

    System.out.println("in " + (end - start) / 1000.0 + "s");

  }
}
