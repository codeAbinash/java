package oop;

public class MethodOverloading {
  static void method(int a) {
    System.out.println("Method with one argument");
  }

  // Method overloading
  static void method(int a, int b) {
    System.out.println("Method with two arguments");
  }

  public static void main(String[] args) {
    method(1);
    method(1, 2);
  }
}