package oop;

abstract class MyClass {
  abstract void method1();

  abstract void method2();

  void method3() {
    System.out.println("Method 3");
  }
}

abstract class MySubClass extends MyClass {
  void method1() {
    System.out.println("Method 1");
  }
}

class MySubSubClass extends MySubClass {
  void method2() {
    System.out.println("Method 2");
  }
}

public class AbstractClass {
  public static void main(String[] args) {
    MySubSubClass obj = new MySubSubClass();
    obj.method1();
    obj.method2();
    obj.method3();
  }
}
