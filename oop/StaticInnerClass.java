package oop;

class Outer {
  static int a = 10;

  static class Inner {
    void method() {
      System.out.println("Value of a is " + a);
    }
  }

}

public class StaticInnerClass {
  public static void main(String[] args) {
    Outer.Inner obj = new Outer.Inner();
    obj.method();
  }
}
