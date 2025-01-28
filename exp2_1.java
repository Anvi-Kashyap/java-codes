Q1.  Wap to display the employee details of 5 employees using scanner class.

import java.util.Scanner;

class exp2_1 {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

        void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------------");
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();

            scanner.nextLine(); 

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(id, name, department, salary);
        }

        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }

        scanner.close();
    }
}
