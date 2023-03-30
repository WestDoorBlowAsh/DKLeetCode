package com.code2004.leetBook.ChuJiSuanFa.dynamic_programming;

public class DP3 {

    public int maxSubArray(int[] nums) {

        int max = 0;
        if (nums == null || nums.length == 0) {
            return max;
        }
        int[] dp = new int[nums.length];
        max = dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + Math.max(dp[i - 1], 0);
            max = Math.max(dp[i], max);
        }

        return max;
    }


    private void test() {

        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));

    }

    public static void main(String[] args) {

        new DP3().test();
    }
}
