Q4.  Wap to implement both recursive and non-recursive functions to find the fibonacci series. 

import java.util.Scanner;

public class exp2_4 {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n; // Base cases: F(0) = 0, F(1) = 1
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void fibonacciNonRecursive(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series (Non-Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        fibonacciNonRecursive(n);

        System.out.print("Fibonacci series (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();

        scanner.close();
    }
}
