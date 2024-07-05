package strings;

public class StringBufferStringBuilder {
  public static void main(String[] args) {
    String s = "Abinash Karmakar"; // This is immutable
    System.out.println(s);

    StringBuffer sb = new StringBuffer("Hello Abinash"); // This is mutable
    sb.setCharAt(5, '_'); // Thread safe, a bit slower
    System.out.println(sb);

    StringBuilder sb1 = new StringBuilder("Hello Abinash"); // This is mutable
    sb1.setCharAt(5, '_'); // Not thread safe, faster
    System.out.println(sb1);

    sb.insert(5, " "); // Inserting a space at index 5
    System.out.println(sb);

    sb.append(" Hello World"); // Appending a string
    System.out.println(sb);

    sb.delete(5, 6); // Deleting a character at index 5
    System.out.println(sb);

    for (int i = 0; i < 100; i++) {
      System.out.println("Len: " + sb.length() + " Capacity" + sb.capacity());
      sb.append("A");
    }

    // Default capacity is 16

  }
}
