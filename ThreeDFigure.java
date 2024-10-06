
//Define the interface
interface ThreeDFigure1 {
    double curvedSurfaceArea();
    double totalSurfaceArea();
    double volume();
}

// Implement the Cylinder class
class Cylinder implements ThreeDFigure1 {
     double radius;
     double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    //method to calculate curved surface area
    public double curvedSurfaceArea() {
        return 2 * 3.14 * radius * height;
    }

    // method to calculate total surface area
    public double totalSurfaceArea() {
        return 2 * 3.14 * radius * (radius + height);
    }
    
    // method to calculate volume
    public double volume() {
        return 3.14 * radius * radius * height;
    }
}

//-----------------------------------------------------------
public class ThreeDFigure {
    public static void main(String[] args) {
        double radius = 5;
        double height = 10;
        Cylinder cylinder = new Cylinder(radius, height);
        
        System.out.println("Cylinder with radius " + radius + " and height " + height);
        // printing curved surface area
        System.out.println("Curved Surface Area: " + cylinder.curvedSurfaceArea());
        // printing total surface area
        System.out.println("Total Surface Area: " + cylinder.totalSurfaceArea());
        System.out.println("Volume: " + cylinder.volume());
    }
}