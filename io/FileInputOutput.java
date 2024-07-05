package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutput {
  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("./io/test.txt");
    FileOutputStream fos = new FileOutputStream("./io/test1.txt");

    int b;
    while ((b = fis.read()) != -1) {
      if (b >= 65 && b <= 90) {
        fos.write(b + 32);
      } else if (b >= 97 && b <= 122) {
        fos.write(b - 32);
      } else {
        fos.write(b);
      }
    }

    fis.close();
    fos.close();
  }
}
