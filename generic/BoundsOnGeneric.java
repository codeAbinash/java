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

class MyArray2<T> extends MyArray<String> {
  public MyArray2(int size) {
    super(size);
  }
}

// Only Number and its subclasses are allowed
class MyArray3<T extends Number> extends MyArray<T> {
  public MyArray3(int size) {
    super(size);
  }
}

public class BoundsOnGeneric {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    @SuppressWarnings("rawtypes")
    MyArray arr = new MyArray(5);
    arr.append("Hello");
    arr.append("World");
    arr.append(100);
    arr.print();

    MyArray2<String> arr2 = new MyArray2<>(5);
    arr2.append("Hello");
    arr2.append("World");
    arr2.print();

    // MyArray2<Integer> arr3 = new MyArray2<>(5);
    // arr3.append(5); // Compile-time error

    // Only Number and its subclasses are allowed
    MyArray3<Integer> arr4 = new MyArray3<>(5);
    arr4.append(5);
    arr4.append(10);
    arr4.print();
  }
}