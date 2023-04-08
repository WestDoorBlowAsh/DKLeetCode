package com.code2004.leetBook.ZhongJiSuanFa.Array_String;

public class AS6 {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int middle = small;
        for (int n : nums) {
            if (n <= small) {
                small = n;
            } else if (n <= middle) {
                middle = n;
            } else {
                return true;
            }
        }
        return false;
    }

    void test() {
        System.out.println(increasingTriplet(new int[]{1,2,3,4,5}));
        System.out.println(increasingTriplet(new int[]{5,4,3,2,1}));
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
        System.out.println(increasingTriplet(new int[]{20,100,10,12,5,13}));
        System.out.println(increasingTriplet(new int[]{1,1,1,1,1,1}));
        System.out.println(increasingTriplet(new int[]{1,5,0,4,1,3}));
    }

    public static void main(String[] args) {
        new AS6().test();
    }
}
