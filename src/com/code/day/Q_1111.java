package com.code.day;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_1111 {

    public int[] maxDepthAfterSplit(String seq) {

        /*
            初始化数组
            int[] a = new int[100];
            int[] a = {1,2,3}；
            int[] a = new int[] {1,2,3}；
         */


        int[] res = new int[seq.length()];

        if (seq.length() == 0) return res;

        int depA = 1;
        int depB = 0;


        for (int i = 1; i < seq.length(); i++) {

            char ch = seq.charAt(i);

            if (ch == '(') {

//                System.out.println("(( a " + depA + " b = " + depB);


                if (depA > depB) {
                    res[i] = 1;
                    depB++;
                } else {
                    res[i] = 0;
                    depA++;
                }

//                System.out.println("((" + Arrays.toString(res) + "\n");

            } else {

//                System.out.println(")) a " + depA + " b = " + depB);


                if (depA > depB) {
                    res[i] = 0;
                    depA--;
                } else {
                    res[i] = 1;
                    depB--;
                }

//                System.out.println("))" + Arrays.toString(res));
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
    
        Q_1111 obj = new Q_1111();

        String seq;
        int[] res;

        seq = "(()())";
        res = obj.maxDepthAfterSplit(seq);
        System.out.println(Arrays.toString(res));

        seq = "()(())()";
        res = obj.maxDepthAfterSplit(seq);
        System.out.println(Arrays.toString(res));
    }
}
