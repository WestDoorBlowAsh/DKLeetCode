package com.code2004.leetBook.ChuJiSuanFa.array;

public class A2 {

    public int maxProfit(int[] prices) {

        int len = prices.length;
        int sum = 0;
        for (int i = 0, j = 1; j < len; i++, j++) {
            if (prices[j] > prices[i]) {
                sum += prices[j] - prices[i];
            }
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
