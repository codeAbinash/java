package serialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Serialization {
  public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("./serialization/test.txt");
    PrintStream ps = new PrintStream(fos);
    Student s = new Student();
    s.roll = 1;
    s.name = "Abinash";
    s.dept = "CSE";

    ps.println(s.roll);
    ps.println(s.name);
    ps.println(s.dept);

    ps.close();

    FileInputStream fis = new FileInputStream("./serialization/test.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fis));

    Student s1 = new Student();
    s1.roll = Integer.parseInt(br.readLine());
    s1.name = br.readLine();
    s1.dept = br.readLine();

    System.out.println(s1.roll + " " + s1.name + " " + s1.dept);

    br.close();
    fos.close();

  }
}
