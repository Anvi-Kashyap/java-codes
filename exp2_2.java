Q2.  Wap to check if the sum of all the digits of an input number is prime, armstrong, perfect or 
not. Check for all the three and display output accordingly. 
Example- 
Input a number- 250 
Sum is 7 
Prime: Y 
Armstrong: Y 
Perfect: N

import java.util.Scanner;

public class exp2_2 {
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isArmstrong(int num) {
        int original = num, sum = 0;
        int digits = String.valueOf(num).length(); // Find number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int inputNumber = scanner.nextInt();

        int sumOfDigits = 0;
        int temp = inputNumber;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        boolean prime = isPrime(sumOfDigits);
        boolean armstrong = isArmstrong(sumOfDigits);
        boolean perfect = isPerfect(sumOfDigits);

        System.out.println("Sum is: " + sumOfDigits);
        System.out.println("Prime: " + (prime ? "Y" : "N"));
        System.out.println("Armstrong: " + (armstrong ? "Y" : "N"));
        System.out.println("Perfect: " + (perfect ? "Y" : "N"));

        scanner.close();
    }
}
