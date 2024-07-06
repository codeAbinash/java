package generic;

class MyArray<T> {
  private T[] array;
  int length;

  @SuppressWarnings("unchecked")
  public MyArray(int size) {
    array = (T[]) new Object[size];
  }

  public void append(T data) {
    array[length++] = data;
  }

  public T get(int index) {
    return array[index];
  }

  public void print() {
    for (int i = 0; i < length; i++) {
      System.out.println(array[i]);
    }
  }

}

public class GenericArgument {
  static void fun(MyArray<?> arr) {
    arr.print();
  }

  static void funSimilar(MyArray<?> arr) {
    arr.print();
  }

  static void funSimilar1(MyArray<? extends Number> arr) {
    arr.print();
  }

  public static void main(String[] args) {
    MyArray<Integer> intArr = new MyArray<>(3);
    intArr.append(1);
    intArr.append(2);
    intArr.append(3);

    MyArray<String> strArr = new MyArray<>(3);
    strArr.append("Hello");
    strArr.append("World");
    strArr.append("Java");

    fun(intArr);
    fun(strArr);

  }
}
