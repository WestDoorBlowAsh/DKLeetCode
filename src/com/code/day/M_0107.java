package com.code.day;

import java.util.Arrays;

public class M_0107 {

    /*
    1.只旋转 len 一半
    2.对角线  j , i。 其余 i， j
     */

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = matrix[n - 1 - j][n - 1 - i];
                matrix[n - 1 - j][n - 1 - i] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        M_0107 obj = new M_0107();

        int[][] matrix;
        matrix = new int[][] {
                {1,2,3,},
                {4,5,6,},
                {7,8,9,},
        };
        Arrays.asList(matrix).stream().forEach((x) -> System.out.println(Arrays.toString(x)));
        obj.rotate(matrix);
        Arrays.asList(matrix).stream().forEach((x) -> System.out.println(Arrays.toString(x)));

        matrix = new int[][] {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        Arrays.asList(matrix).stream().forEach((x) -> System.out.println(Arrays.toString(x)));
        obj.rotate(matrix);
        Arrays.asList(matrix).stream().forEach((x) -> System.out.println(Arrays.toString(x)));

    }
}
