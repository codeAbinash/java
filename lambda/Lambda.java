package lambda;

@FunctionalInterface
interface MyLambda {
  void foo();
}

@FunctionalInterface
interface MyLambda2 {
  int foo(int a, int b);
}

public class Lambda {
  public static void main(String[] args) {
    MyLambda l1 = new MyLambda() {
      public void foo() {
        System.out.println("Hello from l1");
      }
    };

    l1.foo();

    MyLambda l2 = () -> {
      System.out.println("Hello from l2");
    };
    l2.foo();

    MyLambda2 l3 = (a, b) -> {
      return a * b;
    };
    System.out.println(l3.foo(10, 20));

    MyLambda2 l4 = (a, b) -> a * b;
    System.out.println(l4.foo(12, 22));

  }
}
