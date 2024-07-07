package collections;

import java.util.BitSet;

public class BitSetDemo {
  public static void main(String[] args) {
    BitSet bs1 = new BitSet();

    bs1.set(0);
    bs1.set(1);
    bs1.set(2);
    bs1.set(99);

    System.out.println("bs1: " + bs1);

    BitSet bs2 = new BitSet();

    bs2.set(1);
    bs2.set(2);
    bs2.set(3);
    bs2.set(4);

    System.out.println("bs2: " + bs2);

    bs1.or(bs2);

    System.out.println("bs1 AND bs2: " + bs1);

    bs1.flip(0, 10);

    System.out.println("bs1: " + bs1);

  }
}
