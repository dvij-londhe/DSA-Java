package Array;

class SearchInRotatedSortedArray {

    static void main(String[] args) {
        int[] arr = {3, 1};
        System.out.println(search(arr, 1));
    }

    static int search(int[] arr, int target) {
        int peak = findPivot(arr);
        System.out.println(peak);
        int firstTry = binarySearch(arr, target, 0, peak);

        if(firstTry != -1) {
            return firstTry;
        }

        return binarySearch(arr, target, peak, arr.length - 1);
    }

    static int findPivot(int[] arr){
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

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
