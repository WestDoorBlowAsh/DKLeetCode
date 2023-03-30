package com.code2004.leetBook.ChuJiSuanFa.dynamic_programming;

public class DP2 {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int maxPro = 0;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - min);
        }

        return maxPro;
    }


    private void test() {

        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {1,2,3,4,5};
        int[] prices3 = {7,6,4,3,1};

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
        
    }
    
    public static void main(String[] args) {
    
        new DP2().test();
    }
}
