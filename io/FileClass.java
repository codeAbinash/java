package io;

import java.io.File;

public class FileClass {
  public static void main(String[] args) {
    File f = new File("Main.java");
    System.out.println("isDirectory : " + f.isDirectory());
    System.out.println("Length: " + f.length());

    File io = new File("./io");
    System.out.println("isDirectory " + io.isDirectory());

    File list[] = io.listFiles();
    int i = 1;
    for (File file : list) {
      System.out.println(i + ". " + file.getName() + "\t\t-\t" + file.getPath());
      i++;
    }

  }
}
