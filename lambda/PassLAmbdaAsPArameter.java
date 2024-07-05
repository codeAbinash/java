package lambda;

@FunctionalInterface
interface MyLambda {
  void foo();
}

class UseLambda {
  void callLambda(MyLambda l) {
    l.foo();
  }

}

public class PassLAmbdaAsPArameter {
  public static void main(String[] args) {
    UseLambda ul = new UseLambda();

    ul.callLambda(() -> {
      System.out.println("Hello from l1");
    });
  }
}
