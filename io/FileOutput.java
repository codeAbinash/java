package io;

import java.io.FileOutputStream;

public class FileOutput {
  public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("./io/test.txt");
    String str = "Hello to the new File. ";
    byte[] b = str.getBytes();
    for (byte x : b)
      fos.write(x);

    str = "Hello This is Abinash Karmakar. ";
    b = str.getBytes();
    fos.write(b, 6, str.length() - 6);

    str = "I am a Programmer. ";
    fos.write(str.getBytes());

    fos.close();
  }
}
