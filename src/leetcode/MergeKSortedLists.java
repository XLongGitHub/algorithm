package leetcode;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeKSortedLists {

//    public ListNode mergeKLists(ListNode[] lists) {
//        ListNode head = minNode(lists);
//        ListNode next = head;
//        //链表为空返回
//        while (true) {
//            ListNode tmp = minNode(lists);
//            if (tmp == null) break;  //所有节点全部遍历完成
//            next.next = tmp;
//            next = tmp;
//        }
//        return head;
//    }
//
//    /**
//     * 找到当前几个链表中最小的节点
//     * @param lists
//     * @return
//     */
//    public ListNode minNode(ListNode[] lists) {
//        ListNode minNode = null;
//        int minVal = 0;
//        for (int i = 0; i < lists.length; i++) {
//            if (minNode == null) {
//                if (lists[i] != null) {
//                    minNode = lists[i];
//                    minVal = minNode.val;
//                }
//            } else {
//                if (lists[i] != null && minVal > lists[i].val) {
//                    minNode = lists[i];
//                    minVal = lists[i].val;
//                }
//            }
//        }
//        nextLists(lists, minVal);   //移动最小元素节点到下一个位置
//        return minNode;
//    }
//
//    public void nextLists(ListNode[] lists, int val) {
//        for (int i = 0; i < lists.length; i++) {
//            if (lists[i] != null && lists[i].val == val) {
//                lists[i] = lists[i].next;
//                return;
//            }
//        }
//    }

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new LinkedList();
        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                list.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Object[] ints = list.toArray();
        Arrays.sort(ints);
        return createList(ints);
    }

    public ListNode createList(Object[] vals) {
        ListNode head = new ListNode((Integer) vals[0]);
        ListNode next = head;
        if (vals.length >= 1) {
            for (int i = 1; i < vals.length; i++) {
                ListNode tmp = new ListNode((Integer) vals[i]);
                next.next = tmp;
                next = tmp;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode[] lists = new ListNode[1];
        ListNode head1 = new ListNode(0);
        ListNode next1 = head1;
        ListNode tmp = new ListNode(2);
        next1.next = tmp;
        next1 = tmp;
        tmp = new ListNode(5);
        next1.next = tmp;
        next1 = tmp;
        lists[0] = head1;
        MergeKSortedLists mk = new MergeKSortedLists();
        mk.mergeKLists(lists);
    }
}