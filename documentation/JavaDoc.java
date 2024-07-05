/**
 * @author Abinash Karmakar
 * The JavaDoc class is used to demonstrate the JavaDoc documentation.
 * @version 1.0
 * @since 2021-03-23
 * @see https://github.com/codeAbinash/java
 */

package documentation;

public class JavaDoc {
  /**
   * The main method is the entry point of the program.
   * 
   * @param args The command line arguments
   * @return void
   * @throws Exception
   */
  public static void main(String[] args) {

  }

  /**
   * @deprecated This method is deprecated and replaced by {@link #newMethod()}
   */
  public static void oldMethod() {
    System.out.println("This is a deprecated method");
  }

  public static void newMethod() {
    System.out.println("This is a new method");
  }

}
