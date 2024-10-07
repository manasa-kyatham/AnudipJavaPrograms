import java.util.Scanner;

public class AreaCalculator
{

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) 
    {
        return 3.14 * radius*radius;
    }

    // Method to calculate the area of a square
    public static double calculateArea(int sideLength)
    {
        
            return sideLength * sideLength;
       
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
            return length*width;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Area Calculator!");
        System.out.println("------------------------------------------");
        System.out.println("Choose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("------------------------------------------");
        System.out.print("Enter your choice (1/2/3): ");
        // user select choice 
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            	// circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                // calculate area of the circle
                System.out.println("Area of the circle: " + calculateArea(radius));
                break;
            case 2:
            	// square
                System.out.print("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();
                // calculate area of the square
                System.out.println("Area of the square: " + calculateArea(sideLength));
                break;
            case 3:
            	// rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                // calculate area of the rectangle
                System.out.println("Area of the rectangle: " + calculateArea(length, width));
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }

    }
}
