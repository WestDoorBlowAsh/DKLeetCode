package com.code.explore.list;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int[] arr) {
        if (arr == null || arr.length == 0) return;

        ListNode last = null;
        for (int temp : arr) {
            if (last == null) {
                val = temp;
                last = this;
            } else {
                ListNode node = new ListNode(temp);
                last.next = node;
                last = node;
            }
        }
    }

    ListNode getNode(int value) {
        ListNode node = this;
        while (node != null) {
            if (node.val == value) return node;
            node = node.next;
        }
        return null;
    }

    @Override
    public String toString() {
        ListNode node = this;
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val + " ");
            node = node.next;
        }
        return sb.toString();
    }

    public void deleteNode(ListNode node) {
        ListNode head = this;
        while (head != null) {
            if (head.next == node) {
                head.next = node.next;
            }
            head = head.next;
        }
    }

    public void deleteNode1(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{4,5,1,9};

        ListNode head = new ListNode(arr);
        System.out.println(head);


        ListNode valNode = head.getNode(5);
        head.deleteNode1(valNode);
        System.out.println(head);

    }

}
