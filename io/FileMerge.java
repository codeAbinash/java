package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class FileMerge {
  public static void main(String[] args) throws Exception {
    FileInputStream source1 = new FileInputStream("./io/test.txt");
    FileInputStream source2 = new FileInputStream("./io/test1.txt");

    FileOutputStream destination = new FileOutputStream("./io/output.txt");
    SequenceInputStream sis = new SequenceInputStream(source1, source2);

    int b;
    while ((b = sis.read()) != -1) {
      destination.write(b);
    }

    source1.close();
    source2.close();
    destination.close();

  }
}
