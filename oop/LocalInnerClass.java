package oop;

class Outer {
  int a = 25;

  void method() {
    class Inner {
      void method() {
        System.out.println("Value of a is " + a);
      }
    }

    Inner obj = new Inner();
    obj.method();
  }
}

public class LocalInnerClass {
  public static void main(String[] args) {
    Outer obj = new Outer();
    obj.method();
  }
}
