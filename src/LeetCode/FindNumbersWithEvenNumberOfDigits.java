package LeetCode;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/


public class FindNumbersWithEvenNumberOfDigits {
    static void main(String[] args) {
        int[] arr = {1, 55, 645, 0, 99856, 55, 656, 12, 233, 444444, 1212121, -2, -44, 666, 12, 12, 12, 12};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(isEven(nums[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int num) {
        int numberOfDigits = digits2(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if(num == 0) {
            return 1;
        }
        if(num < 0) {
            num = num * -1;
        }

        int count = 0;

        while(num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    // More efficient digits() method

    static int digits2(int num) {
        if(num == 0) {
            return 1;
        }
        if(num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
