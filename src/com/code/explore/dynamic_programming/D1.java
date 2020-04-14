package com.code.explore.dynamic_programming;

public class D1 {

    int[] arr;

    public int climbStairs1(int n) {

        if (n == 0) return 1;
        if (n < 0) return 0;
        int sum = climbStairs(n - 1) + climbStairs(n - 2);
        return sum;
    }

    public int climbStairs2(int n) {

        if (arr == null || n >= arr.length) {
            arr = new int[n + 1];
        }

        if (n == 0) return 1;
        if (n < 0) return 0;

        if (arr[n] > 0) return arr[n];

        int sum = climbStairs(n - 1) + climbStairs(n - 2);
        arr[n] = sum;
        return sum;
    }

    public int climbStairs(int n) {

        int[] dp = new int[n+1];

        if (n <= 3) return n;

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }


    public static void main(String[] args) {
    
        D1 obj = new D1();

        int n = 1;
        System.out.println(obj.climbStairs(n));

        n = 2;
        System.out.println(obj.climbStairs(n));

        n = 3;
        System.out.println(obj.climbStairs(n));

        n = 44;
        System.out.println(obj.climbStairs(n));
    }
}
