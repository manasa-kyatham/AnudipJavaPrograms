import java.util.Scanner;

public class EvenNumbers 
{
	public static void main(String []args)
	{
		int[] numbers;
		numbers=new int[10];
		/* Creating variables for index */
		int index;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 numbers");
		for(index=0;index<numbers.length;index++)
		{
			numbers[index]=sc.nextInt();
		}
		// Displaying elements of the array
		System.out.println("--------------------------------------");
		System.out.println("Entered numbers are ");
		for(index=0;index<numbers.length;index++)
		{
			System.out.println(numbers[index]+",");
		}
		/*displaying even numbers only */
		System.out.println("------------------------------------------");
		System.out.println("Even numbers are ");
		for(index=0;index<numbers.length;index++)
		{
			//checking elements of array is even
			if(numbers[index]%2==0)
			{
				System.out.print(numbers[index]+",");
			}
		}
		
		
	}

}
