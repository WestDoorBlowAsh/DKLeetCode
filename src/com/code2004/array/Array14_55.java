package com.code2004.array;

import java.util.ArrayList;
import java.util.List;

public class Array14_55 {

    public boolean canJump1(int[] nums) {

        int len = nums.length;
        if (len == 1) return true;

        List<Integer> goodPos = new ArrayList();

        goodPos.add(len - 1);

        for (int i = len - 2; i >= 0; i--) {

            int step = nums[i];
            int stepSum = nums[i] + i;

            boolean isGood = false;
            for (int j = 0; j < goodPos.size(); j++) {
                int obj = goodPos.get(j);
                if (obj >= 0 && stepSum >= obj) {
                    isGood = true;
                    break;
                }
            }

            if (isGood) {
                if (i == 0) {
                    return true;
                }
                goodPos.add(i);
            }
        }

        return false;
    }

    public boolean canJump(int[] nums) {

        int len = nums.length;

        if (len == 1) return true;
        int goodPos = len - 1;

        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] + i >= goodPos) {
                if (i == 0) {
                    return true;
                }
                goodPos = i;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] a1 = {2,3,1,1,4};
        int[] a2 = {3,2,1,0,4};
        int[] a3 = {4,3,1,1,4};

        Array14_55 a = new Array14_55();

        System.out.println(a.canJump(a1));
        System.out.println(a.canJump(a2));
        System.out.println(a.canJump(a3));

    }
}
