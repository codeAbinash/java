package exception;

public class FinallyBlock {
  static int meth1(int a, int b) throws Exception {
    try {
      return a / b;
    } finally {
      System.out.println("Finally block executed");
    }
  }

  static void meth2() {
    try {
      meth1(10, 0);
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    meth2();
  }
}
