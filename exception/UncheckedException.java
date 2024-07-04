package exception;

public class UncheckedException {
  public static void main(String[] args) {
    try {
      int x = 10 / 0;
      System.out.println(x);
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
      System.out.println(e);
      e.getStackTrace();
    }
  }
}
