package Array;

// when you know it's a sorted array
// but you don't know the order of array (asc or desc)

public class OrderAgnosticBS {
    static void main(String[] args) {
        int[] asc = {2, 2, 22, 23, 34, 44, 48, 51, 55, 61, 68, 70};
        int[] desc = {78, 65, 51, 49, 33, 28, 22, 12, 9, 5, 3};
        int target = 22;
        System.out.println("Ascending array (my method): " + search(asc, target));
        System.out.println("Descending array (my method): " + search(desc, target));
        System.out.println("Ascending array (efficient): " + orderAgnosticBS(asc, target));
        System.out.println("Descending array (efficient): " + orderAgnosticBS(desc, target));

    }

    static int search(int[] arr, int target) {
        if(arr[0] <= arr.length -1) {
            return ascBS(arr, target);
        }
            return descBS(arr, target);
    }

    static int ascBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int descBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                end = mid - 1;
            } else if(target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


// More Efficient Way: No need to create multiple methods
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                return mid;
            }

            if(isAsc) {
                if(target > arr[mid]) {
                    start = mid + 1;
                } else if(target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if(target < arr[mid]) {
                    start = mid + 1;
                } else if(target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }


}
