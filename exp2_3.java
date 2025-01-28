Q3.  Wap to convert an input number into its respective binary and hexadecimal (without using any 
built-in library or method) 

import java.util.Scanner;

public class exp2_3 {

    public static String toBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, num % 2); 
            num /= 2;
        }
        return binary.length() > 0 ? binary.toString() : "0"; 
    }

    public static String toHexadecimal(int num) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num > 0) {
            hex.insert(0, hexChars[num % 16]); 
            num /= 16;
        }
        return hex.length() > 0 ? hex.toString() : "0"; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int inputNumber = scanner.nextInt();

        String binary = toBinary(inputNumber);
        String hexadecimal = toHexadecimal(inputNumber);

        System.out.println("Binary: " + binary);
        System.out.println("Hexadecimal: " + hexadecimal);

        scanner.close();
    }
}
