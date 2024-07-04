package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
  static FileReader f;

  static void method() {
    try {
      f = new FileReader("file.txt");
      // Checked Exception, Must be handled
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }

  static void method2() {
    // Try with resources supports multiple resources, that classes must implement
    // AutoCloseable interface
    try (FileReader f = new FileReader("file.txt")) {
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    method();
    method2();
  }
}
