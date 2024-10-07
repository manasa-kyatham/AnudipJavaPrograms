package car;

class Car
{	
	// Parent class
	public void parent()
	{
		// creating method parent
		System.out.println("This is Parent class");
	}
}

class Mahindra extends Car
{
	// child class
	// creating method display
	public void display()
	
	{
		System.out.println("This is Mahindra car");
	}
	//creating detailsOfCar method
	public void detailsOFCar()
	{
		// printing details of the class
		System.out.println("Details of the Car");
		System.out.println("Price(Rs):11lakhs \n Fuel type: Diesel \n Engine size: 1497 cc \n Ratings: 4 Star");
	}
}

/*--------------------------------------------*/
public class InheritanceExample
{

	public static void main(String[] args) 
	{
		//object creation for derived class
		Mahindra mymahindra = new Mahindra();
		mymahindra.parent();		//calling the method from the car class
		/* ------ mymahindra.display();
		 
		          mymahindra.detailsOFCar(); ---------*/

	}

}


