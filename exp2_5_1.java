Q5.1.  Wap to print the following pattern (Number of columns/levels must be taken input by the 
user). 
A 
A B 
A B C 
A B C D 
A B C D E 

import java.util.Scanner;

public class exp2_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of levels: ");
        int levels = scanner.nextInt();

        for (int i = 1; i <= levels; i++) {
            char letter = 'A'; // Start from 'A'
            for (int j = 1; j <= i; j++) {
                System.out.print(letter + " ");
                letter++; // Move to the next character
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
