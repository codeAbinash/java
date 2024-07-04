package util;

public class Rectangle {
  int l, b;

  public Rectangle(int l, int b) {
    this.l = l;
    this.b = b;
  }

  public int area() {
    return l * b;
  }
}