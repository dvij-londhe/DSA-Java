package Array;
// Ceiling
// Same algorithm as binary search; just return "start" instead of "-1" if the target not found

public class BinarySearchCeiling {
    static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 10, 13, 15, 16, 17};
        System.out.println(search(arr, 18));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length - 1]) {
            return -1;
        }

        while(start <= end) {
//            find the middle element
//          int mid = (start + end) / 2;  // in this line there is a possibilty that (start + end) could exceed the limit of integer
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid -1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}
