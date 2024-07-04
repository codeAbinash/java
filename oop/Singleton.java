package oop;

class MyClass {
  static private MyClass obj = null;

  private MyClass() {
    System.out.println("Object created");
  }

  public static MyClass getInstance() {
    if (obj == null)
      obj = new MyClass();
    return obj;
  }
}

public class Singleton {
  public static void main(String[] args) {
    MyClass obj1 = MyClass.getInstance();
    MyClass obj2 = MyClass.getInstance();
    System.out.println(obj1 == obj2); // true, the same Object
  }
}
