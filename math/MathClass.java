package math;

public class MathClass {

  public static void print(String message) {
    System.out.println(message);
  }

  public static void main(String[] args) {
    print("Math class methods");
    double x = Math.abs(-10.5);
    print("Math.abs(-10.5): " + x);
    x = Math.ceil(10.5);
    print("Math.ceil(10.5): " + x);
    x = Math.floor(10.5);
    print("Math.floor(10.5): " + x);
    x = Math.max(10.5, 20.5);
    print("Math.max(10.5, 20.5): " + x);
    x = Math.min(10.5, 20.5);
    print("Math.min(10.5, 20.5): " + x);
    x = Math.pow(2, 3);
    print("Math.pow(2, 3): " + x);
    x = Math.sqrt(25);
    print("Math.sqrt(25): " + x);
    x = Math.cbrt(27);
    print("Math.cbrt(27): " + x);
    x = Math.round(10.5f);
    print("Math.round(10.5f): " + x);
    x = Math.random();
    print("Math.random(): " + x);
    x = Math.sin(30);
    print("Math.sin(30): " + x);
    x = Math.asin(0.5);
    print("Math.asin(0.5): " + x);
    x = Math.sinh(30);
    print("Math.sinh(30): " + x);
    x = Math.signum(-10.5);
    print("Math.signum(-10.5): " + x);
    x = Math.toDegrees(30);
    print("Math.toDegrees(30): " + x);
    x = Math.toRadians(30);
    print("Math.toRadians(30): " + x);

    x = Math.floorDiv(10, 3);
    print("Math.floorDiv(10, 3): " + x);

    x = Math.floorMod(10, 3);
    print("Math.floorMod(10, 3): " + x);

    x = Math.IEEEremainder(10, 3);
    print("Math.IEEEremainder(10, 3): " + x);

    x = Math.nextAfter(10, 3);
    print("Math.nextAfter(10, 3): " + x);

    x = Math.nextUp(10);
    print("Math.nextUp(10): " + x);

    x = Math.nextDown(10);
    print("Math.nextDown(10): " + x);

    x = Math.copySign(10, -3);
    print("Math.copySign(10, -3): " + x);

    x = Math.getExponent(10);
    print("Math.getExponent(10): " + x);

    x = Math.getExponent(10);
    print("Math.getExponent(10): " + x);

    x = Math.hypot(10, 3);
    print("Math.hypot(10, 3): " + x);

    x = Math.ulp(10);
    print("Math.ulp(10): " + x);

    x = Math.scalb(10, 3);
    print("Math.scalb(10, 3): " + x);

    x = Math.log(10);
    print("Math.log(10): " + x);

    x = Math.log10(10);
    print("Math.log10(10): " + x);

    x = Math.log1p(10);
    print("Math.log1p(10): " + x);

    x = Math.multiplyExact(10, 3);
    print("Math.multiplyExact(10, 3): " + x);

    print("\nMath class constants");
    print("Math.E: " + Math.E);
    print("Math.PI: " + Math.PI);

  }
}
