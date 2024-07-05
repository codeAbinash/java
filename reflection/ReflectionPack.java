package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyClass {
  int x;
  String y;
  public String name;
  private int age;

  public MyClass() {
    x = 10;
    y = "Hello";
    name = "John";
    age = 20;
  }

  public MyClass(int x, String y, String name, int age) {
    this.x = x;
    this.y = y;
    this.name = name;
    this.age = age;
  }

  public void print() {
    System.out.println("x: " + x + ", y: " + y + ", name: " + name + ", age: " + age);
    privateMethod();
  }

  private void privateMethod() {
    System.out.println("Private method");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class ReflectionPack {
  @SuppressWarnings("rawtypes")
  public static void main(String[] args) {
    Class c = MyClass.class;
    System.out.println(c.getName());
    Constructor[] constructors = c.getConstructors();
    System.out.println("\nConstructors");
    for (Constructor constructor : constructors) {
      System.out.println(constructor);
    }
    Method methods[] = c.getMethods();
    System.out.println("\nMethods");
    for (Method method : methods) {
      System.out.println(method);
    }

    Field fields[] = c.getDeclaredFields();
    System.out.println("\nFields");
    for (Field field : fields) {
      System.out.println(field);
    }

  }
}
