package wrapper;

public class IntegerClass {
  public static void main(String[] args) {
    // Integer a = new Integer(100); // Deprecated
    Integer a = Integer.valueOf(100);
    Integer b = 100; // Auto boxing
    int c = b; // Auto unboxing

    System.out.println(a.equals(c)); // Checks the vale not the reference
    System.out.println(a.compareTo(b)); // Compares the value

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.SIZE);

    System.out.println(Integer.valueOf(100));
    System.out.println(Integer.valueOf("100"));
    System.out.println(Integer.valueOf("101010", 2));
    System.out.println(Integer.parseInt("100"));
    System.out.println(Integer.parseInt("101010", 2));
    System.out.println(Integer.toBinaryString(100));
    System.out.println(Integer.toHexString(100));
    System.out.println(Integer.toOctalString(100));
    System.out.println(Integer.toString(100));
    System.out.println(Integer.toString(100, 2));
    System.out.println(Integer.toString(100, 16));
    System.out.println(Integer.compare(100, 100));
    System.out.println(Integer.compare(100, 101));
    System.out.println(Integer.sum(100, 100));
    System.out.println(Integer.decode("0x64"));
    System.out.println(Integer.reverse(100));
    System.out.println(Integer.reverseBytes(100));
    System.out.println(Integer.rotateLeft(100, 2));
    System.out.println(Integer.rotateRight(100, 2));
    System.out.println(Integer.highestOneBit(100));
    System.out.println(Integer.lowestOneBit(100));
    System.out.println(Integer.numberOfLeadingZeros(100));
    System.out.println(Integer.numberOfTrailingZeros(100));
    System.out.println(Integer.bitCount(100));
    System.out.println(Integer.signum(100));
    System.out.println(Integer.toUnsignedLong(100));
    System.out.println(Integer.toUnsignedString(100));
    System.out.println(Integer.toUnsignedString(100, 2));
    System.out.println(Integer.divideUnsigned(100, 2));
    System.out.println(Integer.remainderUnsigned(100, 2));
    System.out.println(Integer.compareUnsigned(100, 100));
    System.out.println(Integer.divideUnsigned(100, 2));
    System.out.println(Integer.highestOneBit(100));
    System.out.println(Integer.lowestOneBit(100));
    System.out.println(Integer.max(100, 100));
    System.out.println(Integer.min(100, 100));
    System.out.println(Integer.sum(100, 100));

  }
}
