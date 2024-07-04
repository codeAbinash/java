import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a, b, c;
    System.out.println("Enter the sides of the triangle: ");
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();

    double s = (a + b + c) / 2;
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    System.out.println("Area of the triangle is: " + area);

    sc.close();
  }
}
