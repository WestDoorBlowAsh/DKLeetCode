package com.code2004.day;

import com.code2004.leetBook.ListNode;

import java.util.*;

public class Q_445 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        ListNode p1 = l1, p2 = l2;

        while (p1 != null) {
            s1.push(p1.val);
            p1 = p1.next;
        }

        while (p2 != null) {
            s2.push(p2.val);
            p2 = p2.next;
        }

        int more = 0;
        ListNode head = null;
        while (!s1.isEmpty() || !s2.isEmpty() || more > 0) {

            Integer n1 = s1.isEmpty() ? 0 : s1.pop();
            Integer n2 = s2.isEmpty() ? 0 : s2.pop();


            Integer sum = n1 + n2 + more;
            more = sum / 10;

            ListNode next = new ListNode(sum % 10);
            next.next = head;
            head = next;
        }

        return head;
    }

    public static void main(String[] args) {

        Q_445 obj = new Q_445();

        int[] a1 = new int[]{7,2,4,3};
        int[] a2 = new int[]{5,6,4};

        ListNode l1 = new ListNode(a1);
        ListNode l2 = new ListNode(a2);


        System.out.println(obj.addTwoNumbers(l1, l2));
    }
}
