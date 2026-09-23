package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, -66, -7, 12, -55, 89, 128, 996, 90, 11, 3};
        int target = 5;
        int answer = linearSearch(arr, target);
        System.out.println(answer);
    }

    // Searching in the array:
    // Return the index if item found in the array
    // otherwise return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0 ) {
            return -1;
        }

        for(int index = 0; index < arr.length; index++) {
            // check for target element at every index
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }

        // this line will execute if the above return statement did not execute
        // hence target not found so, return -1
        return -1;
    }
}
