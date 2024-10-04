import java.util.*;

public class LeapYearChecker 
{
	public static void main(String[] args) 
	{
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();					// Read the year
        if(year%4 == 0 && year%100 !=0 || year%400==0)	 // Check if the year is a leap year
        {
        	System.out.println(year + " is a leap year");
        }
        else
        {
        	System.out.println(year +" is not a leap year");
        }
        
	}

}
