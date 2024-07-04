package basic;

public class FormatSpecifier {

  public static void main(String[] args) {
    int x = 13;
    double y = 20.0;
    System.out.printf("x = %d, y = %f\n", x, y);

    String name = "John";

    System.out.printf("Hello, %-10s! x = %d, y = %f\n", name, x, y); // Left-justified

    System.out.printf("x = %d, y = %.2f\n", x, y); // 2 decimal places

    System.out.printf("x = %05d\n", x); // Fill with 0

    int z = -13;

    System.out.printf("z = %+d\n", z); // Show sign

  }
}