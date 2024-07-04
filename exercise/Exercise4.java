// Overloaded method to calculate areas of different shapes

abstract class Shape {
  abstract double area();
}

class Rectangle extends Shape {
  double length, width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double area() {
    return length * width;
  }
}

class Circle extends Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  double area() {
    return Math.PI * radius * radius;
  }
}

class Exercise4 {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[2];
    shapes[0] = new Rectangle(10, 20);
    shapes[1] = new Circle(5);

    for (Shape shape : shapes) {
      System.out.println("Area: " + shape.area());
    }
  }
}