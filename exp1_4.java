Q4.  WAP for calculator to perform addition, subtraction, multiplication, division using 
Number class and object. 

import java.util.*;
public class exp1_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        double num1=sc.nextDouble();

        System.out.println("Enter second number");
        double num2=sc.nextDouble();

        double addition=num1+num2;
        double Substraction= num1-num2;
        double multiplication= num1*num2;
        double division=num1/num2;

        System.out.println("addition: "+addition);
        System.out.println("substraction: "+Substraction);
        System.out.println("multiplication: "+multiplication);
        System.out.println("division: "+division);
    }
}