package io;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

  public static void main(String[] args) throws Exception {
    RandomAccessFile rf = new RandomAccessFile("./io/test.txt", "rw");
    System.out.print((char) rf.read());
    System.out.print((char) rf.read());
    System.out.print((char) rf.read());
    System.out.print((char) rf.read());
    System.out.print((char) rf.read());

    rf.write('_');

    rf.skipBytes(10);
    System.out.println();
    System.out.print((char) rf.read());

    rf.seek(rf.getFilePointer() + 3);
    System.out.print((char) rf.read());

    rf.close();
  }
}