package com.code2004.leetBook.ChuJiSuanFa.sort_search;

import java.util.Arrays;

public class SS1 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            nums1[p--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        System.arraycopy(nums2, 0, nums1, 0, p2+1);

    }

        public void merge1(int[] nums1, int m, int[] nums2, int n) {

        int last = 0;
        for (int i = 0; i < nums2.length; i++) {

            int insert = nums2[i];
            for (int j = last; j < nums1.length; j++) {
                if (insert <= nums1[j]) {

                    for (int k = nums1.length - 1; k > j; k--) {
                        nums1[k] = nums1[k-1];
                    }
                    nums1[j] = insert;
                    m++;
                    break;
                } else if (m == 0 || insert > nums1[m-1]){
                    nums1[m] = insert;
                    m++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        SS1 obj = new SS1();

        int[] nums1;
        int m = 3;
        int[] nums2;
        int n = 3;

        nums1 = new int[]{1,2,3,0,0,0};
        m = 3;
        nums2 = new int[]{2,5,6};
        n = 3;

        obj.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{-1,0,0,3,3,3,0,0,0};
        m = 6;
        nums2 = new int[]{1,2,2};
        n = 3;

        obj.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{0};
        m = 0;
        nums2 = new int[]{1};
        n = 1;

        obj.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
