package Array;
// Kunal's Approach

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchInStricktlySortedMatrix {
    static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 16;
        int[] ans = search(matrix, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] binarySearch(int[][] matrix, int target, int row, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(matrix[row][mid] == target) {
                return new int[]{row, mid};
            }

            if(target > matrix[row][mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }

    static int[] search (int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // cautious, row might be empty

        if(rows == 1) {
            return binarySearch(matrix, target, 0, 0, cols - 1);
        }
        int rStart = 0;
        int rEnd = matrix.length - 1;
        int midCol = cols / 2;
        // run the loop till two rows are remaining
        while(rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][midCol] == target) {
                return new int[]{mid, midCol};
            }

            if(target > matrix[mid][midCol]) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // check whether the targe is in the column
        if(matrix[rStart][midCol] == target) {
            return new int[]{rStart, midCol};
        }
        if(matrix[rStart + 1][midCol] == target) {
            return new int[]{rStart + 1, midCol};
        }

        // search in every corner
        // corner 1
        if(target <= matrix[rStart][midCol - 1]) {
            return binarySearch(matrix, target, rStart, 0, midCol - 1);
        }
        // corner 2
        if(target >= matrix[rStart][midCol + 1] && target < matrix[rStart][cols - 1]) {
            return binarySearch(matrix, target, rStart, midCol + 1, cols-1);
        }
        //corner 3 and 4
        if(target <= matrix[rStart + 1][midCol - 1]) {
            return binarySearch(matrix, target, rStart + 1, 0, midCol - 1);
        } else {
            return binarySearch(matrix, target, rStart + 1, midCol + 1, cols - 1);
        }
    }
}
