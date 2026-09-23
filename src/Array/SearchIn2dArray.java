package Array;

import java.util.Arrays;

public class SearchIn2dArray {
    static void main(String[] args) {
        int[][] arr = {
                {33, 65, 98},
                {65, 90, 887},
                {44, 12, 38},
                {50, 10, 37}
        };

        int target = -7;
        int[] ans = search(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        if(arr.length == 0) {
            return new int[]{-1};
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1};
    }
}
