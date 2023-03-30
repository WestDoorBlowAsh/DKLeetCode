package com.code2004.leetBook.ChuJiSuanFa.Other;

import java.util.ArrayList;
import java.util.List;

public class O4 {
    /*
    1
    11
    121
    1331

     */

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        int i = 1;
        while (i <= numRows) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    temp.add(1);
                } else {
                    int ele = list.get(i - 2).get(j) + list.get(i - 2).get(j - 1);
                    temp.add(ele);
                }
            }
            list.add(temp);
            i++;
        }

        return list;
    }

    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> origin = new ArrayList<>();
        origin.add(1);
        list.add(origin);

        int i = 1;
        while (i <= numRows) {
            /*
            00
            10 11
            20 21(10+11) 22
            i-1 j-1 i-1 j
             */
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                List<Integer> lastList = list.get(i - 1);
                if (j > 0) {
                    int ele = lastList.get(j - 1);
                    if (j < lastList.size()) {
                        ele += lastList.get(j);
                    }
                    temp.add(j,  ele);
                } else {
                    temp.add(j, lastList.get(j));
                }
            }
            list.add(temp);

            i++;
        }

        list.remove(0);

        return list;
    }

    private void test() {

        System.out.println(generate(1));
        System.out.println(generate(5));

    }
    
    public static void main(String[] args) {
    
        new O4().test();
    }
}
