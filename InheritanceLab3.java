/*Create a class Person with fields name and age 
 * and a parameterized constructor to initialize them. 
 * Then, create a subclass Employee that inherits from Person 
 * and has an additional field employeeId.
 *  Write constructors for the Employee class that initialize its fields 
 *  and invoke the constructor of the Person class.*/

//Create a class Person with fields name and age 
class Person 
{
    // Fields
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
/*---------------------------------------------------------*/
//create a subclass Employee that inherits from Person
class Employee extends Person 
{
    // Additional field
    String employeeId;

    // Parameterized constructor
    public Employee(String name, int age, String employeeId) 
    {
        // Call the constructor of the superclass (Person)
        super(name, age);
        this.employeeId = employeeId;
    }

    // Getter
    public String getEmployeeId() {
        return employeeId;
    }
}
/*----------------------------------------------------*/
//main class
public class InheritanceLab3 
{
	 public static void main(String[] args) 
	 {
		 	System.out.println("--------Employee Details----------");
	        Employee employee = new Employee("John Doe", 30, "E12345");
	        // prints the name of the employee
	        System.out.println("Name: " + employee.getName());
	        //Age of the employee
	        System.out.println("Age: " + employee.getAge());
	        //prints Employee Id
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	    }

}
