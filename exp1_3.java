Q3.  WAP to print ASCII values of numbers and different characters

import java.util.*;
public class exp1_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a character");
        char ch= sc.next().charAt(0);

        int asciivalue=(int)ch;
        System.out.println("Asciivalue of character ch "+ch+"="+asciivalue);
    }
}