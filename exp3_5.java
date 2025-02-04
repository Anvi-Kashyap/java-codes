//Q5.  Write a program to find the minimum product of any two elements in an array. 
//Test case-1 
//Input: 2541 
//Output:  2  ( as 1*2 is the lowest among all other possible operations like 1*5, 1*4, 2*5, 
//2*4, etc.) 

import java.util.Arrays;

public class exp3_5 {
    public static void main(String[] args) {
        
        int[] array = {2, 5, 4, 1};

        int minProduct = findMinimumProduct(array);

        System.out.println("Minimum product: " + minProduct);
    }

    public static int findMinimumProduct(int[] array) {
        
        Arrays.sort(array);

        return array[0] * array[1];
    }
}


