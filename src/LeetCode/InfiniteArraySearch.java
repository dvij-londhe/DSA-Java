package LeetCode;

public class InfiniteArraySearch {

    static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return Bsearch(arr, target, start, end);

    }

    static int Bsearch(int[] nums, int target, int start, int end) {
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == nums[mid]) {
                return mid;
            } else if(target > nums[mid]) {
                start = mid++;
            } else {
                end = mid--;
            }
        }
        return ans;
    }
}
