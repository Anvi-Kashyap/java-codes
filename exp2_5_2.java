Q5.2.  Wap to print the following pattern (Number of columns/levels must be taken input by the 
user).
 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 
 

import java.util.Scanner;

public class exp2_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int levels = scanner.nextInt();

        for (int i = 1; i <= levels; i++) {
           
            for (int j = 1; j <= levels - i; j++) {
                System.out.print(" ");
            }

            
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
