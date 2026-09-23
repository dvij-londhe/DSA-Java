package Array;

public class FindMax {
    static void main(String[] args) {
        int[] arr = {6, 88, 4, -79, 1, 289, 11};
        System.out.println(max(arr));
    }

    // Assuming arr is not an empty array
    static int max(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
