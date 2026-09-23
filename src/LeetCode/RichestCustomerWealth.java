package LeetCode;
// https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {-1, 3, 5}
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for(int[] account: accounts) {
            int sum = sum(account);
            if( sum > maxWealth) {
                maxWealth = sum;
            };
        }
        return maxWealth;
    }

    static int sum(int[] arr) {
        int sum = 0;
        for(int num: arr) {
            sum += num;
        }
        return sum;
    }
}
