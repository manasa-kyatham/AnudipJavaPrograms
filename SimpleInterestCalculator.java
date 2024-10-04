import java.util.Scanner;

public class SimpleInterestCalculator 
{
	public static float calculateSI(float principal,int time,float rate)
	{
		float si;
		//cal simple interest
		si=(principal*rate*time)/100;
		// returning simple interest
		return si;
	}

	    public static void main(String[] args)
	    {
	    	// creating object of scanner class
	    	Scanner sc=new Scanner(System.in);
	    	// variables to store principal,rate,time
	    	float principal,rate;
	    	int time;
	    	// data through the keyboard
	    	System.out.println("Enter principal(in Rs): ");
	    	principal=sc.nextFloat();
	    	// data through the keyboard
	    	System.out.println("Enter time(in years): ");
	    	time=sc.nextInt();
	    	// data through the keyboard
	    	System.out.println("Enter rate(in %): ");
	    	rate=sc.nextFloat();
	    	/*------------------------------------*/
	    	//cal si
	    	float interest=calculateSI(principal,time,rate);
	    	float amount=principal+interest;
	    	System.out.println("-----------------------------------------");
	    	System.out.println("Amount is paid is "+amount );
	
	    }	

}
