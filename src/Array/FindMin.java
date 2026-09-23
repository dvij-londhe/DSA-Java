package Array;

public class FindMin {
    static void main(String[] args) {
        int[] arr = {6, 88, 4, -79, 1, 289, 11};
        System.out.println(min(arr));
    }

    // Assuming arr is not an empty array
    static int min(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
