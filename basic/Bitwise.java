package basic;
public class Bitwise {
  public static void main(String[] args) {
    byte a = 9, b = 12;

    byte c = (byte) (a & b);
    byte d = (byte) (a | b);
    byte e = (byte) (a ^ b);
    byte f = (byte) (~a);
    byte g = (byte) (a << 2);
    byte h = (byte) (a >> 2);
    byte i = (byte) (a >>> 2);

    System.out.println("a & b = " + c);
    System.out.println("a | b = " + d);
    System.out.println("a ^ b = " + e);
    System.out.println("~a = " + f);
    System.out.println("a << 2 = " + g);
    System.out.println("a >> 2 = " + h);
    System.out.println("a >>> 2 = " + i);
  }
}
