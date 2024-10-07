
/*---Write a program to calculate 
      area of rectangle,triangle,square and circle ---*/
class AreaCalculator 
{
	    /* Method to calculate area of a rectangle */
	    public void calculateArea(int length, int width)
	    {
	        int area = length * width;
	        System.out.println("--------Rectangle--------");
	        System.out.println("Length = " + length + " cm");
	        System.out.println("Width = " + width + " cm");
	        System.out.println("Area = " + area + " cm");
	    }

	    /* Method to calculate area of a triangle */
	    public void calculateArea(float base, float height) 
	    {
	        float area = 0.5f * base * height;
	        System.out.println("--------Triangle--------");
	        System.out.println("Base = " + base + " cm");
	        System.out.println("Height = " + height + " cm");
	        System.out.println("Area = " + area + " cm");
	    }

	    /* Method to calculate area of a square */
	    public void calculateArea(int side) 
	    {
	        int area = side * side;
	        System.out.println("--------Square--------");
	        System.out.println("Side = " + side + " cm");
	        System.out.println("Area = " + area + " cm");
	    }

	    /* Method to calculate area of a circle */
	    public void calculateArea(float radius) 
	    {
	        float area = 3.14f * radius * radius;
	        System.out.println("--------Circle--------");
	        System.out.println("Radius = " + radius + " cm");
	        System.out.println("Area = " + area + " cm");
	    }
}

class AreaCalculatorExample 
{
	   public static void main(String[] args) 
	   {
	        /* Creating the object of AreaCalculator */
	        AreaCalculator ac = new AreaCalculator();
	        ac.calculateArea(10, 5); //Area of Rectangle
	        ac.calculateArea(10.0f, 5.0f); // Area of Triangle
	        ac.calculateArea(7); // Area of Square
	        ac.calculateArea(7.0f); // Area of Circle
	    }
}


