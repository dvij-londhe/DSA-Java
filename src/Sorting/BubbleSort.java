package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2, 20, 15, 17, 12};
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
         //run the steps n-1 times
        for(int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;

            // For each step, Max item will come to the last index of the array
            for (int j = 1; j <= (arr.length - (1 + i)); j++) {

                // swap if the item at j'th index is smaller than item at index j - 1
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }

            // if the swapping did not occur in any iteration of value of i, then exit the loop. hence the array is sorted from
            // the value of i in which swapping did not occur
            if (!isSwapped) {
                break;
            }
        }

    }
}
