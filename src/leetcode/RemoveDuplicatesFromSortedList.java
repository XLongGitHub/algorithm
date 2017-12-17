package leetcode;

import java.util.List;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p != null) {
            while (p.next != null && p.val == p.next.val) {
                ListNode release = p.next;
                p.next = p.next.next;
                release = null;
            }
            p = p.next;
        }
        return head;
    }

    public static void printf(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + "  ");
            listNode = listNode.next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p = head;
        ListNode tmp = new ListNode(1);
        p.next = tmp;
        p = p.next;
        tmp = new ListNode(1);
        p.next = tmp;
        p = p.next;
//        printf(head);

//        tmp = new ListNode(2);
//        head.next = tmp;
//        tmp = new ListNode(2);
//        head.next = tmp;


        head.next = tmp;
        RemoveDuplicatesFromSortedList rdfsl = new RemoveDuplicatesFromSortedList();
        ListNode result = rdfsl.deleteDuplicates(head);
        printf(result);

    }
}