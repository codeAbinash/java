// Remove Special Characters from a String
// Remove extra spaces from a string
// Find number of words in a string

/**
 * Exercise3
 */
public class Exercise3 {

  public static void main(String[] args) {
    String str = "   Hello! How are     you? I am         fine.    ";
    System.out.println(str.replaceAll("[^a-zA-Z0-9\\s]", ""));
    System.out.println(str.replaceAll("\\s+", " ").trim());

    String[] words = str.trim().split("\\s+");
    System.out.println(words.length);
  }
}