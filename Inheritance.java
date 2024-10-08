
//Create a class Vehicle with fields make and model 
class Vehicle 
{
    // Fields
    String make;
    String model;

    // Parameterized constructor
    public Vehicle(String make, String model) 
    {
        this.make = make;
        this.model = model;
    }

    // Getters
    public String getMake() 
    {
        return make;
    }

    public String getModel() 
    {
        return model;
    }
}
//-------------------------------------------------------------

//create a subclass Car that inherits from Vehicle
class Car extends Vehicle 
{
    // Additional field
    int year;

    // Parameterized constructor
    public Car(String make, String model, int year) 
    {
        // Call the constructor of the superclass (Vehicle)
        super(make, model);
        this.year = year;
    }

    // Getter
    public int getYear() 
    {
        return year;
    }
}
/*---------------------------------------------------------------------*/
//main class
public class Inheritance 
{
	public static void main(String[] args)
	{
		System.out.println("--------Car Details---------");
        Car myCar = new Car("Toyota", "Corolla", 2020);
        //prints make, model ,year 
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
    }

}
