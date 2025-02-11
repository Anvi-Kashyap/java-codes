//Q2. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows: 
//Name                   Ujwal  Ravi  
//Year of joining        2024   2023   
//Address                BBS    KUR 

class Employee { 
    private String name; 
    private int yearOfJoining; 
    private double salary; 
    private String address; 

    public Employee(String name, int yearOfJoining, double salary, String address) { 
        this.name = name; 
        this.yearOfJoining = yearOfJoining; 
        this.salary = salary; 
        this.address = address; 
    } 

    public String getName() { 
        return name; 
    } 

    public int getYearOfJoining() { 
        return yearOfJoining; 
    } 

    public String getAddress() { 
        return address; 
    } 
} 

public class exp4_2 {
    public static void main(String[] args) { 
        Employee emp1 = new Employee("Ujwal", 2024, 50000, "BBS"); 
        Employee emp2 = new Employee("Ravi", 2023, 60000, "KUR"); 
        Employee emp3 = new Employee("Amit", 2022, 55000, "DEL"); 

        System.out.printf("%-10s %-15s %s%n", "Name", "Year of Joining", "Address");
        System.out.println("-------------------------------------");
        System.out.printf("%-10s %-15d %s%n", emp1.getName(), emp1.getYearOfJoining(), emp1.getAddress());
        System.out.printf("%-10s %-15d %s%n", emp2.getName(), emp2.getYearOfJoining(), emp2.getAddress());
        System.out.printf("%-10s %-15d %s%n", emp3.getName(), emp3.getYearOfJoining(), emp3.getAddress());
    } 
}
