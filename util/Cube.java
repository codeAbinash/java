package util;

public class Cube extends Rectangle {
  int h;

  public Cube(int l, int b, int h) {
    super(l, b);
    this.h = h;
  }

  // Method overriding
  public int area() {
    return 2 * (l * b + b * h + h * l);
  }

  public int volume() {
    return l * b * h;
  }
}