package oop;

class Super {
  void method() {
    System.out.println("Super Method");
  }
}

class Sub extends
    Super {
  void method() {
    System.out.println("Sub Method");
  }

  void method2() {
    System.out.println("Sub Method 2");
  }
}

public class DynamicMethodDispatch {
  public static void main(String[] args) {
    Super s = new Sub();
    s.method(); // Will call Sub's method
    // s.method2(); // Error
  }
}
