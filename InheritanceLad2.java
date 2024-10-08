/*Create a base class Shape with fields color and filled
 *  and a parameterized constructor. 
 *  Then, create two subclasses, Circle and Rectangle, that inherit from Shape. 
 *  Implement constructors for these subclasses and include methods 
 *  to calculate their respective areas.
 */
//Create a base class Shape with fields color and filled
class Shape
{
	//Fields
	String color;
	boolean filled;
	
	//parameterized constructor
	public Shape(String color,boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	//getters
	public String getcolor()
	{
		return color;
	}
	
	public boolean getfilled()
	{
		return filled;
	}
}
//--------------------------------------------------
/*create subclasses Circle that inherit from Shape. 
 *  Implement constructors for these subclasses and include methods 
 *  to calculate their respective areas.*/

//create subclasses Circle that inherit from Shape
class Circle extends Shape
{
	//additional parameters
	float radius;
	
	public Circle(String color,boolean filled,float radius)
	{
		//calling the constructor of the super class Shape
		super(color,filled);
		this.radius=radius;
	}
	
	//methods to calculate area of circle
	public float getArea()
	{
		return 3.14f*radius*radius;
	}
	
	//Getter
	public float getRadius()
	{
		return radius;
	}
}
//---------------------------------------------------------
/*create subclasses Circle that inherit from Shape. 
 *  Implement constructors for these subclasses and include methods 
 *  to calculate their respective areas.*/

//create a subclass Rectangle that inherits from the Shape
class Rectangle extends Shape
{
	//additional fields
	float length;
	float width;
	
	//parameterized constructor
	public Rectangle(String color,boolean filled,float length,float width)
	{
		//calling the constructor of the super class Shape
		super(color,filled);
		this.length = length;
		this.width= width;
	}
	

	//getters
	public float Length() {
		return length;
	}
	public float Width() {
		return width;
	}
	
	//method to calculate Area of Rectangle
	public float getArea()
	{
		return length*width;
	}
	
}

//main class
public class InheritanceLad2 
{
	public static void main(String[] args) {
		System.out.println("---------Circle--------");
        Circle myCircle = new Circle("Red", true, 5.0f);
        //prints the color of the circle
        System.out.println("Circle Color: " + myCircle.getcolor());
        //prints filled
        System.out.println("Circle Filled: " + myCircle.getfilled());
        //prints radius of the circle
        System.out.println("Circle Radius: " + myCircle.getRadius()+" cm");
        //prints Area of the circle
        System.out.println("Circle Area: " + myCircle.getArea()+" cm");
        
        System.out.println("-----------Rectangle-----------");

        Rectangle myRectangle = new Rectangle("Blue", false, 4.0f, 6.0f);
        // color of the rectangle
        System.out.println("Rectangle Color: " + myRectangle.getcolor());
        System.out.println("Rectangle Filled: " + myRectangle.getfilled());
        // length of the rectangle
        System.out.println("Rectangle Length: " + myRectangle.Length()+" cm");
        // width of the rectangle
        System.out.println("Rectangle Width: " + myRectangle.Width()+" cm");
        //Area of the rectangle
        System.out.println("Rectangle Area: " + myRectangle.getArea()+" cm");
    }

}
