package annotations;

import java.util.List;

class Test {
  @SuppressWarnings("rawtypes")
  static List list;

  @Override // This annotation is used to check if the method is overridden or not
  public String toString() {
    return "Overridden toString method";
  }

  @Deprecated // This annotation is used to mark a method as deprecated
  public static void oldMethod() {
    System.out.println("This is a deprecated method");
  }

  @SuppressWarnings("unchecked") // This annotation is used to suppress warnings
  public static void method1() {
    list.add(10);
  }
}

class Test1<T> {
  @SafeVarargs // This annotation is used to suppress warnings
  public final void method2(T... args) {
    for (T t : args) {
      System.out.println(t);
    }
  }
}

@FunctionalInterface // This annotation is used to mark an interface as functional interface
interface Functional {
  public void hello();
}

public class BuiltInAnnotations {
  @SuppressWarnings("deprecation") // This annotation is used to suppress warnings
  public static void main(String[] args) {
    System.out.println(new Test().toString());
    Test.oldMethod();
  }
}
