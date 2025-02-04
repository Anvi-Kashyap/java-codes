//Q4.  Write a program to move all the zeros of an array to the end of the array. 
//Test case-1 
//Input: 110247745080 
//Output: 112477458000 


import java.util.Arrays;

public class exp3_4 {
    public static void main(String[] args) {
        
        int[] array = {1, 1, 0, 2, 4, 7, 7, 4, 5, 0, 8, 0};

        moveZerosToEnd(array);

        System.out.println("Output: " + Arrays.toString(array));
    }

    public static void moveZerosToEnd(int[] array) {
        int n = array.length;
        int count = 0; 

        
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                array[count++] = array[i]; 
            }
        }

        
        while (count < n) {
            array[count++] = 0;
        }
    }
}

