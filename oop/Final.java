package oop;

class MyClass {
  final int x = 100; // Cannot be changed
  final int y;
  { // Normal block to initialize y
    y = 200;
  }

  static final int z;
  static { // Static block to initialize static variable z
    z = 1000;
  }

  final void method() {
    System.out.println("This is a final method");
  } // Cannot be overridden
}

final class TestClass { // Cannot extend
  int x;
}

public class Final {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    System.out.println(obj.x);
    obj.method();

    TestClass obj2 = new TestClass();
    obj2.x = 10;
    System.out.println(obj2.x);
  }
}
