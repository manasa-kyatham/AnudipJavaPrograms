import java.util.Scanner;

public class DivisionCalculator 
{
    public static void main(String[] args) 
    {
    	// creating scanner class to input through keyboard
        Scanner scanner = new Scanner(System.in);
        
        // ask the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        // ask the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // perform division first number/ second number
         double result = num1 / num2;
         System.out.println("Result of division: " + result);
       

    }
}
