import java.util.*;
public class TriangleAngleChecker 
{
	   public static void main(String[] args) {
		   
		   int angleA;
		   int angleB;
		   int angleC;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the angles of A,B,C"); // Read 3 Angles of the triangle
		   angleA = sc.nextInt();		// Read angleA
		   angleB = sc.nextInt();		// Read angleB
		   angleC = sc.nextInt();		// Read angleC
		   
		   int sum = angleA+angleB+angleC;
		   
		// Check if the angles form a triangle
		   
		   if(sum==180 && angleA!=0 && angleB!=0 && angleC!=0)
		   {
			   System.out.println("Valid Triangle");
		   }
		   else
		   {
			   System.out.println("Invalid triangle");
		   }
	}

}
