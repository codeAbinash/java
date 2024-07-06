package generic;

class Data<T> {
  private T data;

  public void setData(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

}

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

public class GenericClass {
  public static void main(String[] args) {
    Data<String> dStr = new Data<>();
    dStr.setData("Hello");
    System.out.println(dStr.getData());

    Data<Integer> dInt = new Data<>();
    dInt.setData(123);
    System.out.println(dInt.getData());

    MyArray<String> arrStr = new MyArray<>(5);
    arrStr.append("Hello");
    arrStr.append("World");
    arrStr.print();

    MyArray<Integer> arrInt = new MyArray<>(5);
    arrInt.append(1);
    arrInt.append(2);
    arrInt.print();

  }
}
