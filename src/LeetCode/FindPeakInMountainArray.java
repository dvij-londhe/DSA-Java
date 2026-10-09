package LeetCode;

public class FindPeakInMountainArray {

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 9, 12, 20, 19, 11, 9, 8, 3};
        System.out.println(search(arr));
    }

     static int search(int[] arr) {
        int start = 0;
        int end = arr.length;

        while(start != end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }

        return start;
     }
}
