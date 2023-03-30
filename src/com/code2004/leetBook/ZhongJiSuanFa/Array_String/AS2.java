package com.code2004.leetBook.ZhongJiSuanFa.Array_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AS2 {
    public void setZeroes1(int[][] matrix) {

        HashSet<Integer> setI = new HashSet<>();
        HashSet<Integer> setJ = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    setI.add(i);
                    setJ.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (setI.contains(i) || setJ.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes(int[][] matrix) {

        HashSet<Integer> setI = new HashSet<>();
        HashSet<Integer> setJ = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (!setI.contains(i)) {
                        setI.add(i);
                    }
                    if (!setJ.contains(j)) {
                        setJ.add(j);
                    }
                }
            }
        }

        for (Integer x : setI) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[x][j] = 0;
            }
        }
        for (Integer y : setJ) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][y] = 0;
            }
        }
    }

    private void test() {

        int[][] m1 = {
                {1,1,1},
                {1,0,1},
                {1,1,1},
        };
        System.out.println(Arrays.deepToString(m1));
        setZeroes(m1);
        System.out.println(Arrays.deepToString(m1));

        int[][] m2 = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5},
        };
        System.out.println(Arrays.deepToString(m2));
        setZeroes(m2);
        System.out.println(Arrays.deepToString(m2));
    }

    public static void main(String[] args) {

        new AS2().test();
    }
}
