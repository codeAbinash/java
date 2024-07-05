package wrapper;

public class FloatClass {
  public static void main(String[] args) {
    Float a = (float) (100.0 / 0.0);

    System.out.println(Float.isNaN(a)); // false
    System.out.println(Float.isInfinite(a)); // true

    System.out.println(Float.MAX_VALUE);
    System.out.println(Float.MIN_VALUE);
    System.out.println(Float.SIZE);
    System.out.println(Float.BYTES);

    float c = Float.parseFloat("100.0");
    System.out.println(c);

    System.out.println(Float.NaN);
    System.out.println(Float.NaN == Float.NaN); // false

    float nan = Float.NaN;
    System.out.println(nan == nan); // false, NaN is not equal to itself

  }
}
