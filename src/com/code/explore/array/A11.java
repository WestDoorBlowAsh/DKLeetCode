package com.code.explore.array;

import java.util.Arrays;

public class A11 {

    public void rotate(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[n-1-i][j];
                matrix[n-1-i][j] = matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }

        }
    }
    
    public static void main(String[] args) {

        int[][] matrix = {
              {15,13, 2, 5},
              {14, 3, 4, 1},
              {12, 6, 8, 9},
              {16, 7,10,11}
        };

//        matrix = new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };

        Arrays.asList(matrix).stream().forEach(x -> System.out.println(Arrays.toString(x)));

        System.out.printf("\n");
    
        A11 obj = new A11();
        obj.rotate(matrix);

        Arrays.asList(matrix).stream().forEach(x -> System.out.println(Arrays.toString(x)));
    }
}
