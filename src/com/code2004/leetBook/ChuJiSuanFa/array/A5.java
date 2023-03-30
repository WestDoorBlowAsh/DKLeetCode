package com.code2004.leetBook.ChuJiSuanFa.array;

public class A5 {

    public int singleNumber(int[] nums) {

        int sum = 0;

        for (int i :
                nums) {
            sum ^= i;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {2,2,1, 78, 1, 2,78};


        A5 obj = new A5();
        System.out.println(obj.singleNumber(nums));
    }
}
