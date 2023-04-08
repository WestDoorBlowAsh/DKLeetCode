package com.code2004.leetBook.ChuJiSuanFa.list;

import com.code2004.leetBook.ListNode;

public class L6 {

    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head, fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode p = head, q = head;

        do {
            p = p.next;
            q = q.next;
            if (q == null) {
                return false;
            }
            q = q.next;

            if (p == q) {
                return true;
            }

        } while (q != null);

        return false;
    }

    void createCycle(ListNode head, int pos) {
        if (pos < 0) return;
        ListNode node = head;
        int i = 0;
        ListNode lastNextNode = new ListNode(-1);
        while (node.next != null) {
            if (i == pos) {
                lastNextNode = node;
            }
            i++;
            node = node.next;
        }
        if (i >= pos) {
            if (i == pos) {
                lastNextNode = node;
            }
            node.next = lastNextNode;
//            System.out.println(lastNextNode.val + " " + node.val + " " + node.next.val);
        }
    }

    void printListNode(ListNode head, int len) {
        ListNode node = head;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (node != null && i < len) {
            sb.append(node.val + " ");
            node = node.next;
            i++;
        }
        System.out.println(sb.toString());
    }
    
    public static void main(String[] args) {
    
        L6 obj = new L6();

        int[] arr;
        ListNode head;

        arr = new int[]{3,2,0,1};
        head = new ListNode(arr);
        obj.createCycle(head, 1);
        obj.printListNode(head, arr.length);
        System.out.println(obj.hasCycle(head));

        arr = new int[]{3,2,0,1};
        head = new ListNode(arr);
        obj.createCycle(head, -1);
        obj.printListNode(head, arr.length);
        System.out.println(obj.hasCycle(head));

        arr = new int[]{1};
        head = new ListNode(arr);
        obj.createCycle(head, 0);
        obj.printListNode(head, arr.length);
        System.out.println(obj.hasCycle(head));

        arr = new int[]{1,2};
        head = new ListNode(arr);
        obj.createCycle(head, 0);
        obj.printListNode(head, arr.length);
        System.out.println(obj.hasCycle(head));

        arr = new int[]{1,2};
        head = new ListNode(arr);
        obj.createCycle(head, 1);
        obj.printListNode(head, arr.length);
        System.out.println(obj.hasCycle(head));

        arr = new int[]{1,2};
        head = new ListNode(arr);
        obj.createCycle(head, 5);
        obj.printListNode(head, arr.length);
        System.out.println(obj.hasCycle(head));
    }
}
