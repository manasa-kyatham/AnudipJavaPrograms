import java.util.Scanner;

class TemperatureConverter 
{
	    public static void main(String[] args)
	    {
	    	double fahrenheit;
	    	double celsius;
	    	System.out.println("Enter temperature in Fahrenheit");
	    	Scanner sc = new Scanner(System.in);
	    	fahrenheit = sc.nextDouble();							// Read temperature in Fahrenheit
	    	celsius = (fahrenheit - 32)*5/9;						//Fahrenheit to Celsius formula
	    	System.out.println("Tempurature in celsius" + celsius); // Print temperature in Celsius
	    }
}