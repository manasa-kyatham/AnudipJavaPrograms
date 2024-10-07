import java.util.Scanner;
/*------ Defining a class for rectangle ------*/
class Rectangle
{
	/* -------Member variables -----------*/
	float length,breadth;
	/*------- input of data through user -------*/
	public void inputSides()
	{
		/* --------creating object of scanner class-----*/
		Scanner sc=new Scanner(System.in);
		/*------- input data through keyboard------*/
		System.out.println("Enter the length of rectangle(in cm) :  ");
		length=sc.nextFloat();
		System.out.println("Enter breadth of rectangle(in cm) : ");
		breadth=sc.nextFloat();
	}
	
	/*---- method to display data----*/
	public void displaySides()
	{
		System.out.println("-----------Rectangle----------------");
		System.out.println("Length : "+length+"cm");
		System.out.println("Breadth: "+breadth+"cm");
		
	}
	
	/*------ method to calculate perimeter of rectangle ------*/
	public void calculatePerimeter()
	{
		float perimeter;//variable to store area
		perimeter=2*(length+breadth
				);
		System.out.println("Perimeter : "+perimeter+" sq.cm");
	}
	
	/*------ method to calculate Area of the rectangle ---------*/
	public void calculateArea()
	{
		float area;//variable to store area
		area=length*breadth;
		System.out.println("Area : "+area+" sq.cm");
	}
}
/*-----------------------------------------------------*/
public class AreaandPerimeterofRectangle {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/* Creating the object of Rectangle */
		Rectangle rec = new Rectangle();
		rec.inputSides();
		rec.displaySides();
		rec.calculatePerimeter();
		rec.calculateArea();
		
	}

}
