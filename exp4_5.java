//Q5. Demonstrate different ways to initialise instance variables using a constructor.

class Employee { 
    private String name; 
    private int age; 
    private String department; 

    // Default Constructor
    public Employee() { 
        this("Unknown", 0, "Not Assigned"); 
    } 

    // Parameterized Constructor (name, age)
    public Employee(String name, int age) { 
        this(name, age, "Not Assigned"); 
    } 

    // Parameterized Constructor (name, age, department)
    public Employee(String name, int age, String department) { 
        this.name = name; 
        this.age = age; 
        this.department = department; 
    } 

    public void displayInfo() { 
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department); 
    } 
}

public class exp4_5 { 
    public static void main(String[] args) { 
        // Using the default constructor 
        Employee emp1 = new Employee(); 
        emp1.displayInfo(); // Output: Name: Unknown, Age: 0, Department: Not Assigned 

        // Using the parameterized constructor with name and age 
        Employee emp2 = new Employee("Alice", 30); 
        emp2.displayInfo(); // Output: Name: Alice, Age: 30, Department: Not Assigned 

        // Using the parameterized constructor with all parameters 
        Employee emp3 = new Employee("Bob", 35, "Sales"); 
        emp3.displayInfo(); // Output: Name: Bob, Age: 35, Department: Sales 
    } 
}
