Q2.  WAP to swap two numbers using third variables and without using third variables.

public class exp1_2 {
    public static void main(String args[]){
        int a=4;
        int b=8;
        int temp;
        System.out.println("Swapping the numbers using third variable");
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping numnbers the variables are:");
        System.out.println("a is " +a+ " and b is "+b);

        int x=50;
        int y=80;
        System.out.println("\nSwapping the numbers without using third variable.");
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping numnbers the variables are:");
        System.out.println("x is " +x+ " and y is "+y);
    }
}