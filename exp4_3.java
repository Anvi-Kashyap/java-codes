//Q3. Write a program to print the area and  circumference of a circle by creating a class.

class Circle { 
    private double radius; 
    public Circle(double radius) { 
    this.radius = radius; 
    } 
    public double calculateArea() { 
    return Math.PI * radius * radius; // Area = πr² 
    } 
    public double calculateCircumference() { 
    return 2 * Math.PI * radius; // Circumference = 2πr 
    } 
    public void printDetails() { 
    System.out.printf("Area of the circle: %.2f\n", calculateArea()); 
    System.out.printf("Circumference of the circle: %.2f\n", calculateCircumference()); 
    } 
    } 
    public class exp4_3 { 
    public static void main(String[] args) { 
    Circle circle = new Circle(5.0); // Example radius of 5.0 
    circle.printDetails(); 
    } 
    }
    