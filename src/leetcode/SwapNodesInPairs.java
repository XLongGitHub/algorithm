package leetcode;

import java.util.List;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        //单节点或节点为空
        if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second;
        //只要两个节点
        second = first.next;
        first.next = first.next.next;
        second.next = first;
//        if (head.next.next == null) {  //head 节点所指向的内容发生了变化
//            return second;
//        }
        if (first.next == null) return second;
        ListNode newHead = second;
        ListNode end = first;  //前一组元素的最后一个元素
        while (true) {
            ListNode prev = end;
            first = prev.next;
            if (first == null) return newHead;
            second = prev.next.next;
            if (second == null) {  //节点个数为单数
                return newHead;
            }
            first.next = first.next.next;  //接后
            second.next = first;
            prev.next = second;
            end = first;
        }
    }


    public static void main(String[] args) {
        SwapNodesInPairs snip = new SwapNodesInPairs();
//        int[] ints = {1, 2, 3, 4};
//        int[] ints = {1};
        int[] ints = {1, 2};

        ListNode head = snip.createList(ints);
        print(head);
        ListNode swap = snip.swapPairs(head);
        System.out.println();
        print(swap);
    }

    public ListNode createList(int[] vals) {
        ListNode head = new ListNode(vals[0]);
        ListNode next = head;
        if (vals.length >= 1) {
            for (int i = 1; i < vals.length; i++) {
                ListNode tmp = new ListNode(vals[i]);
                next.next = tmp;
                next = tmp;
            }
        }
        return head;
    }

    public static void print(ListNode node) {
        ListNode tmp = node;
        while (tmp != null) {
            System.out.print(tmp.val + "  ");
            tmp = tmp.next;
        }
    }
}