import java.util.Scanner;

class showRoom 
{
    String name;
    long mobno;
    double cost;
    double discount;
    double amount;

//Input method
public void input()
{
	// creating scanner class object
    Scanner scanner = new Scanner(System.in);
    // entering the data through the keyboard
    System.out.print("Enter customer name: ");
    name = scanner.nextLine();
    System.out.print("Enter mobile number: ");
    mobno = scanner.nextLong();
    System.out.print("Enter cost of items purchased: ");
    cost = scanner.nextDouble();
   
}
    
//Calculating discount 
public void calculate() {
    if (cost <= 10000)
    {
        discount = cost * 0.05;
    }
    else if (cost <= 20000) 
    {
        discount = cost * 0.10;
    } 
    else if (cost <= 35000) 
    {
        discount = cost * 0.15;
    }
    else {
        discount = cost * 0.20;
    }
    
    amount = cost - discount;
}

// Display method
public void display() 
{
    System.out.println("Customer Name: " + name);
    System.out.println("Mobile Number: " + mobno);
    System.out.println("Amount to be paid after discount: " + amount);
}

}
class ShowRoom
{
// main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ShowRoom ShowRoom = new ShowRoom();
        ShowRoom.input();
        ShowRoom.calculate();
        ShowRoom.display();

	}

}
