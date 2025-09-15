import java.util.Scanner;

class Circle {
    double radiusInMm;

    Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCircumference() {
        return 2 * radiusInMm * Math.PI;
    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        return "Circle Props: Radius in mm:" + radiusInMm
                +" , Circumference in mm: " + getCircumference()
                + ", AreaInMm2: " + getArea();

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of circle\n");
        System.out.print("Enter your Radius: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);

    }

}
