package Array;

public class searchInRange {
    static void main(String[] args) {
        int[] arr = {-1, 88, 44, 99, 46, -78, 65, 96, 101, -404, 52, 36, 89};
        int target = -404;
        int answer = linearSearchRange(arr, target, 7, 10);
        System.out.println(answer);
    }

    static int linearSearchRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }
        if(start > end || start < 0 || end > arr.length - 1) {
            return -1;
        }

        for(int i = start; i <= end; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
