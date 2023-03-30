package com.code2004.leetBook.ChuJiSuanFa.design_question;

import java.util.ArrayList;

public class DQ2 {
    ArrayList<Integer> arr;
    int len;


    public DQ2() {   // MinStack
        arr = new ArrayList();
        len = 0;
    }

    public void push(int val) {
        arr.add(val);
        len++;
    }

    public void pop() {
        arr.remove(len - 1);
        len--;
    }

    public int top() {
        return arr.get(len - 1);
    }

    public int getMin() {
        if (arr.size() <= 0) return Integer.MIN_VALUE;
        int min = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            min = min < arr.get(i) ? min : arr.get(i);
        }
        return min;
    }


    private void test() {

        DQ2 minStack = new DQ2();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }
    
    public static void main(String[] args) {
    
        new DQ2().test();
    }
}
