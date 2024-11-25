interface Shape {
    void draw();

    double calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.draw();
        System.out.println("Circle Area: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4, 6);
        rectangle.draw();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}