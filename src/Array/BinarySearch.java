package Array;

public class BinarySearch {
    static void main(String[] args) {

        int[] arr = {2, 12, 19, 22, 25, 29, 33, 39, 45, 50, 52, 56, 67, 70, 77, 80}; // example array

        int target = 45;
        int ans = ascendingSearch(arr, target);
        System.out.println(ans);

    }

    // return the index
    // return -1 if it doesn't exist
    static int ascendingSearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

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

        return -1;
    }
}
