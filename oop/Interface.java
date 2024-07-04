package oop;

interface MyInterface {
  int a = 10; // public static final int a = 10;

  void method1();

  void method2();

  // Also possible to define static methods in interfaces
  // It should be a static method
  public static void method3() {
    System.out.println("Value of a: " + a);
  }
}

class MyClass implements MyInterface {
  public void method1() {
    System.out.println("Method 1");
  }

  public void method2() {
    System.out.println("Method 2");
  }

}

interface If1 {
  void method1();

}

interface If2 {
  void method2();
}

abstract class Abs1 implements If1, If2 {
  public void method1() {
    System.out.println("Method 1");
  }
}

class Abs2 extends Abs1 {
  public void method2() {
    System.out.println("Method 2");
  }
}

public class Interface {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.method1();
    obj.method2();
    MyInterface.method3();

    Abs2 obj2 = new Abs2();
    obj2.method1();
    obj2.method2();

  }
}
