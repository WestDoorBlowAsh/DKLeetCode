package com.code2004.leetBook.ChuJiSuanFa.list;

import java.util.HashMap;

public class L3 {


    public ListNode reverseList2(ListNode head) {

        if (head == null || head.next == null) return head;
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public ListNode reverseList1(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return head;
    }

    public ListNode reverseList(ListNode head) {

        if (head == null) return head;

        ListNode slow = head, fast = slow.next;
        HashMap<ListNode, ListNode> map = new HashMap<>();

        while (fast != null) {
            map.put(fast, slow);
            slow = slow.next;
            fast = fast.next;
        }

        ListNode last = slow;
        do {
            fast = map.get(slow);
            slow.next = fast;
            slow = fast;
        } while (fast != null);

        return last;
    }

    public static void main(String[] args) {

        L3 obj = new L3();

        int[] arr = new int[]{1,2,3};
        ListNode head = new ListNode(arr);
        System.out.println(head);

        ListNode rev = obj.reverseList1(head);
        System.out.println(rev);
    }
}
