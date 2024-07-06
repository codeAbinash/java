package generic;

public class GenericMethod {
  static <T> void print(T data) {
    System.out.println(data);
  }

  @SuppressWarnings("unchecked")
  static <T> void print(T... data) {
    for (T d : data) {
      System.out.println(d);
    }
  }

  public static void main(String[] args) {
    print("Hello");
    print(123);
    print(123.45);
    print(new String[] { "Hello", "World" });
    print(new Integer[] { 1, 2, 3 });
    print(new Double[] { 1.1, 2.2, 3.3 });
  }
}
