package com.code2004.leetBook.ChuJiSuanFa.dynamic_programming;

public class DP4 {

    public int rob(int[] nums) {

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if (nums.length == 1) return dp[0];
        dp[1] = nums[1];
        if (nums.length == 2) return Math.max(dp[0], dp[1]);

        int[] sum = new int[nums.length];

        dp[2] = dp[0] + nums[2];

        for (int i = 3; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3]) + nums[i];
        }
        return Math.max(dp[nums.length - 1], dp[nums.length - 2]);
    }
    
    private void test() {
        int[] num = {1,2,3,1,0,5};
        System.out.println(rob(num));
        int[] num1 = {2,1,1,2};
        System.out.println(rob(num1));
        int[] num2 = {2,7,9,3,1};
        System.out.println(rob(num2));
    }

    public static void main(String[] args) {

        new DP4().test();
    }
}
