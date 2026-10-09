package LeetCode;

public class FindSmallestLetterGreaterThanTarget {
    static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char j = 'j';
        char k = 'k';

        System.out.println(search(arr, 'c'));
    }

    static char search(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;


        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < letters[mid]) {
                end = mid -1;
            } else{
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
