package com.code2004.leetBook.ChuJiSuanFa.list;

import com.code2004.leetBook.ListNode;

public class L1 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

        L1 obj = new L1();

        int[] arr = new int[]{4,5,1,9};

        ListNode head = new ListNode(arr);
        ListNode valNode = head.getNode(5);

        obj.deleteNode(valNode);

        System.out.println(head);


    }
}
