 // Interface for 2D shapes 
interface Shape2D { 
    double getArea(); 
} 
 
// Interface for 3D shapes 
interface Shape3D { 
    double getVolume(); 
} 
 
// Abstract class implementing both interfaces 
abstract class Shape implements Shape2D, Shape3D { 
    public abstract void display(); 
} 
 
// Circle class (2D Shape) 
class Circle extends Shape { 
    private double radius; 
 
    public Circle(double radius) { 
        this.radius = radius; 
    } 
 
    // Implement getArea (for 2D) 
    @Override 
    public double getArea() { 
        return Math.PI * radius * radius; 
    } 
 
    // For 3D volume in a circle, it doesn't exist 
    @Override 
    public double getVolume() { 
        return 0; // Circle has no volume 
    } 
 
    @Override 
    public void display() { 
        System.out.println("Shape: Circle"); 
        System.out.println("Radius: " + radius); 
        System.out.println("Area: " + getArea()); 
    } 
} 
 
// Sphere class (3D Shape) 
class Sphere extends Shape { 
    private double radius; 
 
    public Sphere(double radius) { 
        this.radius = radius; 
    } 
 
    // Area for a sphere = surface area 
    @Override 
    public double getArea() { 
        return 4 * Math.PI * radius * radius; 
    } 
 
    // Volume for a sphere 
    @Override 
    public double getVolume() { 
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); 
    } 
 
    @Override 
    public void display() { 
        System.out.println("Shape: Sphere"); 
        System.out.println("Radius: " + radius); 
        System.out.println("Surface Area: " + getArea()); 
        System.out.println("Volume: " + getVolume()); 
    } 
} 
 
// Main class 
public class ShapeTest { 
    public static void main(String[] args) { 
        Shape circle = new Circle(5); 
        Shape sphere = new Sphere(5); 
 
        circle.display(); 
        System.out.println(); 
        sphere.display(); 
    } 
} 