// Maximum of numbers using variable arguments
public class Exercise5 {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.err.println(max(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    System.err.println(max(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
    System.err.println(max(arr));
    System.out.println(max());
  }

  static int max(int... arr) {
    int max = Integer.MIN_VALUE;
    for (int elem : arr) {
      if (elem > max) {
        max = elem;
      }
    }
    return max;
  }
}