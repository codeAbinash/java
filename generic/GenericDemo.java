package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo<T> {
  List<T> data = new ArrayList<>();

  public static void main(String[] args) {
    GenericDemo<String> gStr = new GenericDemo<>();
    gStr.data.add("Hello");
    gStr.data.add("World");
    System.out.println(gStr.data.get(0) + " " + gStr.data.get(1));
  }
}