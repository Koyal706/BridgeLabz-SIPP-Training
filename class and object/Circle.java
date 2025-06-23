class Circle {
    double radius;

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7.0;
        c.display();
    }
}
