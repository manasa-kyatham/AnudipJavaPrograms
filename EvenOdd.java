import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
			
			int number;
			//creating scanner class
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        // Reading data through keyboard
	        number = scanner.nextInt();
	        
	        isEven(number);
	   }

	    // Method to check if a number is even
	    public static void isEven(int number) 
	    {
	    	if (number % 2 == 0) 
	    	{
	    		// print if the given number is even
	            System.out.println(number + " is even number.");
	        } 
	    	else
	    	{
	    		// print if the given number is odd
	            System.out.println(number + " is odd number.");
	        }
	        
	    }
}
