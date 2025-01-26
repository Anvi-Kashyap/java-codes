Q1.  WAP to display the use of arithmetic, logical and relational operators on two 
variables. 

import java.util.*;
public class exp1_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);    
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter your second number");
        int b=sc.nextInt();

        System.out.println("\nArithmetic operators are as follows:");
        System.out.println("Addition : "+ "a+b= "+(a+b));
        System.out.println("Substraction : "+ "a-b= "+(a-b));
        System.out.println("Multiplicatiom : "+ "a*b= "+(a*b));
        System.out.println("Division : "+ "a/b= "+(a/b));
        System.out.println("Modulo : "+ "a%b= "+(a%b));

        System.out.println("\nRelational operators are as follows:");
        System.out.println("Equal to equal to: "+"a==b "+(a==b));
        System.out.println("Not equal to: "+"a==b "+(a!=b));
        System.out.println("Greater than: "+"a==b "+(a>b));
        System.out.println("Smaller than: "+"a==b "+(a<b));
        System.out.println("Greater than and equal to: "+"a==b "+(a>=b));
        System.out.println("Smaller than and equal to: "+"a==b "+(a<=b));

        System.out.println("\nLogical operators are as follows:");
        System.out.println("("+a+")>0 && ("+b+">0):"+((a>0)&&(b>0)));
        System.out.println("("+a+")>0 || ("+b+">0):"+((a>0)||(b>0)));
        System.out.println("!("+b+">0):"+(!(b>0)));
    }
}