package com.crane.match.m_147;

import java.util.Arrays;

public class Q_1138 {


    public String alphabetBoardPath(String target) {
        String[] board = {"abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"};

        int tLen =  target.length();
        int bLen = board.length;

        // 当前位置
        int cx = 0;
        int cy = 0;

        String action = "";


        // 获取 每个字母 的位置
        for (int i = 0; i < tLen; i++) {
            char c = target.charAt(i);

            for (int j = 0; j < bLen; j++) {
                String boardRow = board[j];
                int x = boardRow.indexOf(c);
                if (x >= 0) {

                    int subx = x - cx;
                    int suby = j - cy;

                    String row = subx > 0 ? "R" : "L";
                    String column = suby > 0 ? "D" : "U";


                    subx = Math.abs(subx);
                    suby = Math.abs(suby);

                    if (j == 5) {
                        subx = Math.abs(subx);
                        String[] rowAction = new String[subx];
                        Arrays.fill(rowAction, row);
                        String rowJoin = String.join("", rowAction);
                        action += rowJoin;

                        suby = Math.abs(suby);
                        String[] columnAction = new String[suby];
                        Arrays.fill(columnAction, column);
                        String columnJoin = String.join("", columnAction);
                        action += columnJoin;
                    } else {
                        suby = Math.abs(suby);
                        String[] columnAction = new String[suby];
                        Arrays.fill(columnAction, column);
                        String columnJoin = String.join("", columnAction);
                        action += columnJoin;

                        subx = Math.abs(subx);
                        String[] rowAction = new String[subx];
                        Arrays.fill(rowAction, row);
                        String rowJoin = String.join("", rowAction);
                        action += rowJoin;
                    }


                    cx = x;
                    cy = j;

                    action += "!";

                    break;
                }
            }
        }

        return action;
    }

    public static void main(String[] args) {

        Q_1138 q = new Q_1138();

        System.out.println(q.alphabetBoardPath("leet"));
        System.out.println(q.alphabetBoardPath("zdz"));
    }
}
