package oop;

abstract class MyClass {
  abstract void greet(String name);
}

public class AnonymousInnerClass {
  public static void main(String[] args) {
    MyClass obj = new MyClass() {
      void greet(String name) {
        System.out.println("Hello " + name);
      }
    };
    obj.greet("John");
  }
}
