package com.code.day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q_289 {

    public void gameOfLife(int[][] board) {

        ArrayList<HashMap<String, Integer>> list = new ArrayList<HashMap<String, Integer>>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                Integer afterCell = afterCellValue(board, i, j);
                if (afterCell != board[i][j]) {
                    HashMap<String, Integer> map = new HashMap<String, Integer>();
                    map.put("i", i);
                    map.put("j", j);
                    list.add(map);
                }
            }
        }

        list.forEach(map -> {
            int i = map.get("i");
            int j = map.get("j");
            board[i][j] = board[i][j] == 0 ? 1 : 0;
        });

    }

    Integer afterCellValue(int[][] board, int i, int j) {

        int live = 0, death = 0;

        for (int aroundI = i - 1; aroundI <= i + 1; aroundI++) {
            for (int aroundJ = j - 1; aroundJ <= j + 1; aroundJ++) {
                if (aroundI < 0 || aroundI > board.length - 1) continue;
                if (aroundJ < 0 || aroundJ > board[i].length - 1) continue;
                if (aroundI == i && aroundJ == j) continue;

                int aroundCell = board[aroundI][aroundJ];
                if (aroundCell == 1) {
                    live++;
                } else {
                    death++;
                }
            }
        }

        int currentCell = board[i][j];
        int afterCell = 0;
        if (currentCell == 1) {
            if (live == 2 || live == 3) afterCell = 1;
        } else {
            if (live == 3) afterCell = 1;
        }

        return afterCell;
    }


    public static void main(String[] args) {

        Q_289 obj = new Q_289();

        int[][] arr = new int[][]{
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0},
        };
        Arrays.asList(arr).stream().forEach(x -> System.out.println(Arrays.toString(x)));

        obj.gameOfLife(arr);

        Arrays.asList(arr).stream().forEach(x -> System.out.println(Arrays.toString(x)));
    }
}
