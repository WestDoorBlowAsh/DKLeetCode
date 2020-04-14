package com.code.day;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class M_13 {

    int m = 0;
    int n = 0;
    int k = 0;

    boolean[][] visited;

    public int movingCount(int m, int n, int k) {

        boolean[][] visited = new boolean[m][n];

        int count = dfs(0,0,m,n,k,visited);
        return count;
    }

    int dfs(int i, int j, int m, int n, int k, boolean[][] visited) {
        if ( i<0 || i>=m || j<0 || j>=n || visited[i][j] || (i % 10 + i / 10 + j % 10 + j / 10)>k ) return 0;
        visited[i][j] = true;
        return dfs(i+1,j,m,n,k,visited) + dfs(i-1,j,m,n,k,visited) +
               dfs(i,j+1,m,n,k,visited) + dfs(i,j-1,m,n,k,visited) + 1;
    }


    public int movingCount1(int m, int n, int k) {

        this.m = m;
        this.n = n;
        this.k = k;

        visited = new boolean[m][n];

        int i = 0, j = 0;
        int count = nearCount(i, j);
        return count;
    }

    int nearCount(int i, int j) {
        if (i<0 || i>=m || j<0 || j>=n) return 0;
        if (visited[i][j]) return 0;

        int total = 0;
        int temp = i;
        while (temp != 0) {
            total += temp % 10;
            temp /= 10;
        }
        temp = j;
        while (temp != 0) {
            total += temp % 10;
            temp /= 10;
        }

        if (k < total) return 0;

        visited[i][j] = true;

        return nearCount(i+1, j) + nearCount(i-1, j) + nearCount(i, j+1) + nearCount(i, j-1) + 1;
    }


    
    public static void main(String[] args) {

        M_13 obj = new M_13();

        int m = 2, n = 3, k = 1;
        System.out.println(obj.movingCount(m, n, k));

        m = 3;
        n = 2;
        k = 17;
        System.out.println(obj.movingCount(m, n, k));

        m = 16;
        n = 8;
        k = 4;
        System.out.println(obj.movingCount(m, n, k));

    }
}
