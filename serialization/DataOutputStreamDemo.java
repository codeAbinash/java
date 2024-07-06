package serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {
  public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("./serialization/test1.txt");
    DataOutputStream dos = new DataOutputStream(fos);

    Student s = new Student();
    s.roll = 1;
    s.name = "Abinash";
    s.dept = "CSE";
    s.marks = 99.9f;

    dos.writeInt(s.roll);
    dos.writeUTF(s.name);
    dos.writeUTF(s.dept);
    dos.writeFloat(s.marks);

    dos.close();
    fos.close();

    FileInputStream fis = new FileInputStream("./serialization/test1.txt");
    DataInputStream dis = new DataInputStream(fis);

    Student s1 = new Student();
    s1.roll = dis.readInt();
    s1.name = dis.readUTF();
    s1.dept = dis.readUTF();

    System.out.println(s1.roll + " " + s1.name + " " + s1.dept + " " + dis.readFloat());

    dis.close();
    fis.close();
  }
}
