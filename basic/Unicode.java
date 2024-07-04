package basic;
public class Unicode {
  public static void main(String[] args) {
    char c = 0x0001;
    System.out.println(c);

    // Print all greek letters
    for (int i = 0x0900; i <= 0x0970; i++) {
      System.out.print((char) i + " ");
    }

    // Print hindi digits
    for (int i = 0x0966; i <= 0x096F; i++) {
      System.out.print((char) i + " ");
    }

  }
}
