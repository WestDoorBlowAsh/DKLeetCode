package com.code.explore.list;

public class L4 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode p = l1, q = l2;
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;

        while (p != null && q != null) {

            if (p.val < q.val) {
                prev.next = p;
                p = p.next;
            } else {
                prev.next = q;
                q = q.next;
            }

            prev = prev.next;
        }

        prev.next = p != null ? p : q;

        return prehead.next;
    }

    public static void main(String[] args) {

        L4 obj = new L4();

        int[] arr = new int[]{3,4,5};
        ListNode head = new ListNode(arr);
        System.out.println(head);

        int[] arr1 = new int[]{1,1,2};
        ListNode head1 = new ListNode(arr1);
        System.out.println(head1);

//        ListNode merge = obj.mergeTwoLists(head, head1);

        ListNode merge = obj.mergeTwoLists(head1, head);
        System.out.println(merge);

    }

}
