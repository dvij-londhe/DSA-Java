package LeetCode;

public class FindInMountainArray1095 {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10, 9, 7, 5, 3, 1};

        int ans = search(arr, 9);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int peak = findPeak(arr);
        int first = orderExBS(arr, target, 0, peak);

        if(first < 0) {
            return orderExBS(arr, target, peak, arr.length - 1);
        }

        return first;
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start != end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int orderExBS(int[] arr, int target, int start, int end) {
        int ans = -1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return ans;
    }

}
