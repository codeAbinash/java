package oop;

class Outer {
  int a = 10;

  class Inner {
    void method() {
      System.out.println("Value of a is " + a);
    }
  }
}

public class NestedInnerClass {
  public static void main(String[] args) {
    Outer obj = new Outer();
    Outer.Inner obj2 = obj.new Inner();
    obj2.method();
  }
}
