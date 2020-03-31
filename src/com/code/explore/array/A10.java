package com.code.explore.array;

public class A10 {


    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {

            int[] rowCheck = new int[10];
            int[] columnCheck = new int[10];
            int[] blockCheck = new int[10];

            for (int j = 0; j < 9; j++) {

                char rowEle = board[i][j];
                if (rowEle != '.') {
                    int idx = rowEle - '0';
                    if (rowCheck[idx] == 1) {
                        System.out.println("第" + i + "行有重复的元素");
                        return false;
                    }
                    rowCheck[idx] = 1;
                }

                char columnEle = board[j][i];
                if (columnEle != '.') {
                    int idx = columnEle - '0';
                    if (columnCheck[idx] == 1) {
                        System.out.println("第" + i + "列有重复的元素");
                        return false;
                    }
                    columnCheck[idx] = 1;
                }


                int l = (i * 3 + j % 3) % 9;
                int r = j / 3 + (i / 3) * 3;

                char blockEle = board[l][r];
                if (blockEle != '.') {
                    int idx = blockEle - '0';
                    if (blockCheck[idx] == 1) {
                        System.out.println("第" + i + "个块有重复的元素");
                        return false;
                    }
                    blockCheck[idx] = 1;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };


        A10 obj = new A10();
        System.out.println(obj.isValidSudoku(board));
    }

}
