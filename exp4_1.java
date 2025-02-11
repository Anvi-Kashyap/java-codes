//Q1.Write a program to count the number of objects created using a class. 

public class exp4_1 { 
    private static int instanceCount = 0; 
    public exp4_1() { 
    instanceCount++; 
    } 
    public static int getInstanceCount() { 
    return instanceCount; 
    } 
    public static void main(String[] args) { 
    exp4_1 obj1 = new exp4_1(); 
    exp4_1 obj2 = new exp4_1(); 
    exp4_1 obj3 = new exp4_1(); 
    System.out.println("Number of ObjectCounter instances created: " + 
    exp4_1.getInstanceCount()); 
    } 
    } 