package oop;

class Parent {
  int a = 10;

  Parent() {
    System.out.println("Parent Constructor");
  }

  Parent(int a) {
    this.a = a;
    System.out.println("Parent Constructor with a = " + a);
  }
}

class Child extends Parent {
  Child() {
    System.out.println("Child Constructor");
  }

  Child(int a) {
    super(a);
    System.out.println("Child Constructor with a = " + a);
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Child c = new Child(25);
    System.out.println("c.a = " + c.a);

  }
}