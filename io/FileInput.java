package io;

import java.io.FileInputStream;

public class FileInput {
  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("./io/test.txt");

    byte b[] = new byte[fis.available()];
    fis.read(b);

    String str = new String(b);
    System.out.println(str);
    fis.close();

    fis = new FileInputStream("./io/test.txt");
    int x;
    while ((x = fis.read()) != -1)
      System.out.print((char) x);

    

    fis.close();
  }
}
