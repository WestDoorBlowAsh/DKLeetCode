package com.code.explore.array;

public class A2 {

    public int maxProfit(int[] prices) {

        int len = prices.length;
        int i = 0, j = i + 1;
        int sum = 0;

        while (i < len && j < len) {

            if (prices[i] < prices[j]) {
                sum += prices[j] - prices[i];
            }
            i++;
            j = i + 1;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {1,2,3,4,5};
        int[] prices3 = {7,6,4,3,1};


        A2 obj = new A2();
        System.out.println(obj.maxProfit(prices1));
        System.out.println(obj.maxProfit(prices2));
        System.out.println(obj.maxProfit(prices3));
    }
}
