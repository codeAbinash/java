package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Buffered {

  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("./io/test.txt");
    BufferedInputStream bis = new BufferedInputStream(fis);

    // Marking is supported by BufferedInputStream
    System.out.println("File " + (fis.markSupported() ? "supports" : "doesn't support") + " mark.");
    System.out.println("Buffered " + (bis.markSupported() ? "supports" : "doesn't support") + " mark.");

    int i;
    while ((i = bis.read()) != -1) {
      System.out.print((char) i);
    }
    fis.close();
    System.out.println();

    fis = new FileInputStream("./io/test.txt");
    bis = new BufferedInputStream(fis);
    System.out.print((char) bis.read());
    System.out.print((char) bis.read());
    System.out.print((char) bis.read());
    System.out.print((char) bis.read());
    System.out.print((char) bis.read());
    System.out.print((char) bis.read());
    bis.mark(10);
    System.out.print((char) bis.read());
    System.out.print((char) bis.read());
    bis.reset();
    System.out.print((char) bis.read());
    System.out.print((char) bis.read());
    fis.close();
  }
}