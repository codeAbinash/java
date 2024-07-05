package lambda;

@FunctionalInterface
interface MyLambda {
  void foo(String str);
}

@FunctionalInterface
interface MyLambda2 {
  public int fn(String str1, String str2);
}

public class MethodReference {
  public static void hello(String str) {
    System.out.println("Hello " + str);
  }

  public void hello2(String str) {
    System.out.println("Hello " + str);
  }

  public MethodReference(String str) {
    System.out.println("Hello " + str);
  }

  public MethodReference() {
  }

  public static void main(String[] args) {
    MyLambda l1 = MethodReference::hello;
    l1.foo("Abinash"); // Hello Abinash

    MethodReference mr = new MethodReference();
    MyLambda l2 = mr::hello2;
    l2.foo("World");

    MyLambda l3 = MethodReference::new;
    l3.foo("Constructor"); // Hello Constructor

    MyLambda2 l4 = String::compareTo;
    System.out.println(l4.fn("Hello", "World")); // -15
  }
}
