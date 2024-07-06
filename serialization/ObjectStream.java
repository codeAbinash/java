package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// It must implement Serializable interface
// If this class have any static members, then those members will not be serialized or stored
class Student implements Serializable {
  public int rollNo;
  public String name;
  public float marks;
  public String dept;
  public static int DATA = 10;
  public transient int t;

  public Student() {
  }

  public Student(int rollNo, String name, float marks, String dept) {
    this.rollNo = rollNo;
    this.name = name;
    this.marks = marks;
    this.dept = dept;
    DATA = 20;
    t = 30; // Will not be serialized
  }

  public String toString() {
    return "Roll No: " + rollNo + " Name: " + name + " Marks: " + marks + " Dept: " + dept + " DATA: " + DATA + " t: "
        + t;
  }
}

public class ObjectStream {
  public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("./serialization/test3.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    Student s = new Student(1, "Abinash", 99.9f, "CSE");
    oos.writeObject(s);

    oos.close();
    fos.close();

    FileInputStream fis = new FileInputStream("./serialization/test3.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);

    Student s1 = (Student) ois.readObject();
    System.out.println("Reading object from file:");
    System.out.println(s1);

    ois.close();
    fis.close();
  }
}
