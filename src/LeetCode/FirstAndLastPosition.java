package LeetCode;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

import java.util.Arrays;

public class FirstAndLastPosition {
    static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 4, 5, 6, 6, 9, 11, 11, 11, 11, 11, 11, 11, 20, 20, 30, 40, 40};
        int target = 11;
        System.out.println(Arrays.toString(findFirstAndLast(arr, target)));
    }

    static int[] findFirstAndLast(int[] nums, int target) {
        int[] ans = {-1, -1};
        int first = search(nums, target, true); // Start index
        int last = search(nums, target, false); // end index
        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    static int search(int[] nums, int target, boolean findStart) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                // found our potential answer here, but there is are still chances that the
                // elements are more than one hence search again by the given condition (findStart)
                ans = mid;

                if(findStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}


