package com.code.explore.list;

import java.util.HashMap;

public class L2 {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        HashMap<Integer, ListNode> map = new HashMap<>();

        ListNode p = head;

        int i = 0;
        while (p != null) {
            map.put(i, p);
            i++;
            p = p.next;
        }

        int key = i - n - 1;
        ListNode node = map.get(key);

//        System.out.println(i + " " + map);

        if (key < 0) {
            return head.next;
        } else {
            node.next = node.next.next;
        }

        return head;
    }


    public ListNode removeNthFromEnd1(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        while (fast.next != null) {
            if (n > 0) {
                n--;
            } else {
                slow = slow.next;
            }
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;

    }

    public static void main(String[] args) {

        L2 obj = new L2();

        int[] arr = new int[]{1,2,3};
        ListNode head = new ListNode(arr);
        System.out.println(head);

        ListNode node = obj.removeNthFromEnd(head, 3);
        System.out.println(node);

        node = obj.removeNthFromEnd1(head, 1);
        System.out.println(node);

    }
}
