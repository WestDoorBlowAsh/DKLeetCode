package com.code2004.leetBook.ChuJiSuanFa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class A6 {

    public int[] intersect(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;

        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums1) {
            Integer count = map.get(i);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(i, count);
        }

        System.out.println(map);

        for (int i : nums2) {
            Integer count = map.get(i);
            if (count == null) {
                continue;
            }

            if (count > 0) {
                count--;
                map.put(i, count);
                res.add(i);
            }
        }

        int[] resArr = res.stream().mapToInt(Integer::intValue).toArray();

        return resArr;
    }
    
    public static void main(String[] args) {

        int[] nums1 = {54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41};
        int[] nums2 = {17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20};

//        int[] nums1 = {7,1,2,3};
//        int[] nums2 = {1,2,2,4,5};
    
        A6 obj = new A6();
        System.out.println(Arrays.toString(obj.intersect(nums1, nums2)));
    }
}
