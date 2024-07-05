package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;

public class ByteInputOutput {
  public static void main(String[] args) throws Exception {
    byte b[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
    ByteArrayInputStream bis = new ByteArrayInputStream(b);
    int x;
    while ((x = bis.read()) != -1) {
      System.out.print((char) x);
    }
    bis.close();
    System.out.println();

    bis = new ByteArrayInputStream(b);
    String str = new String(bis.readAllBytes());
    System.out.println(str);

    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    bos.write('a');
    bos.write('b');
    bos.write('c');
    bos.write('d');
    str = new String(bos.toByteArray());
    System.out.println(str);

    // Write to a file
    // bos.writeTo(new FileOutputStream("./io/test3.txt")); // Written in files

    char c[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
    CharArrayReader cr = new CharArrayReader(c);
    x = 0;
    while ((x = cr.read()) != -1) {
      System.err.print((char) x);
    }

  }
}
