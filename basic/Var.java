package basic;

public class Var {
  public static void main(String[] args) {
    int String = 5;
    System.out.println(String); // Works

    byte b1 = 10;
    byte b2 = 0b1010;
    byte b3 = 012;
    byte b4 = 0xA;

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);

    long creditCardNumber = 1234_5678_9012_3456L;
    System.out.println(creditCardNumber);

    float pi = 3.14_15F;
    System.out.println(pi);

    long hexBytes = 0xFF_EC_DE_5E;
    long hexWords = 0xCAFE_BABE;
    long maxLong = 0x7fff_ffff_ffff_ffffL;
    byte nybbles = 0b0010_0101;
    long bytes = 0b11010010_01101001_10010100_10010010;
    System.out.println(hexBytes);
    System.out.println(hexWords);
    System.out.println(maxLong);
    System.out.println(nybbles);
    System.out.println(bytes);
  }
}
