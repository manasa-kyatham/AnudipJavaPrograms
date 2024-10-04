import java.util.*;
public class GreatestNumberFinder 
{
    public static void main(String[] args) 
    {
       
    	int num1,num2,num3,num4,num5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 5 numbers: ");
        num1 = sc.nextInt();		 // Read five numbers
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        num5 = sc.nextInt();
        
        int max = num1;				//Swapping Technique
        
        // Find the greatest number

        if (num2 > max) {			
            max = num2;				// if number2 is greater than max ;then the greater number result is stored in max 
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        if (num5 > max) {
            max = num5;
        }
        if(num1==max && num2==max && num3==max && num4==max && num5==max)	// if all input number are same'
        {
        	System.out.println("The given number is: "+ max);       
        }
        
        // Print the greatest number
        System.out.println("The greatest number is: " + max);
    }

}
