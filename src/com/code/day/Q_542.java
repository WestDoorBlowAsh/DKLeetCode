package com.code.day;


import java.util.Arrays;

public class Q_542 {

    public int[][] updateMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int num = matrix[i][j];
                if (num != 0) {
                    int min = Integer.MAX_VALUE;
                    if (i - 1 >= 0) {
                        min = matrix[i-1][j] > min ? min : matrix[i-1][j];
                    }
                    if (j - 1 >= 0) {
                        min = matrix[i][j-1] > min ? min : matrix[i][j-1];
                    }
                    if (i + 1 < matrix.length) {
                        min = matrix[i+1][j] > min ? min : matrix[i+1][j];
                    }
                    if (j + 1 < matrix[i].length) {
                        min = matrix[i][j+1] > min ? min : matrix[i][j+1];
                    }
                    matrix[i][j] = min+1;
                }
            }
        }
        return matrix;
    }
    
    public static void main(String[] args) {
    
        Q_542 obj = new Q_542();

        int[][] m1;

        m1 = new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0},
        };

        m1 = obj.updateMatrix(m1);
        Arrays.asList(m1).forEach(x -> System.out.println(Arrays.toString(x)));
        System.out.println();


        m1 = new int[][]{
                {0,0,0},
                {0,1,0},
                {1,1,1},
                {1,1,1},
        };

        m1 = obj.updateMatrix(m1);
        Arrays.asList(m1).forEach(x -> System.out.println(Arrays.toString(x)));
        System.out.println();


//        m1 = new int[][]{
//                {1,0,1,1,0,0,1,0,0,1},
//                {0,1,1,0,1,0,1,0,1,1},
//                {0,0,1,0,1,0,0,1,0,0},
//                {1,0,1,0,1,1,1,1,1,1},
//                {0,1,0,1,1,0,0,0,0,1},
//                {0,0,1,0,1,1,1,0,1,0},
//                {0,1,0,1,0,1,0,0,1,1},
//                {1,0,0,0,1,1,1,1,0,1},
//                {1,1,1,1,1,1,1,0,1,0},
//                {1,1,1,1,0,1,0,0,1,1},
//        };
//
//        m1 = obj.updateMatrix(m1);
//        Arrays.asList(m1).forEach(x -> System.out.println(Arrays.toString(x)));
//        System.out.println();
    }
}
