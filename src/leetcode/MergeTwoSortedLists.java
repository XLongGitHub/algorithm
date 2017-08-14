package leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
//        if(l1.val < l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        }
//        if (l2.val < l1.val) {
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//        int val = (l1.val < l2.val) ? l1.val : l2.val;
        ListNode listNode;
        if (l1.val <= l2.val) {
            listNode = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            listNode = new ListNode(l2.val);
            l2 = l2.next;
        }
        ListNode head = listNode;

        while (l1 != null || l2 != null) {
            ListNode tmp;

            if ( l2 == null || l1 != null && l1.val <= l2.val) {
                tmp = new ListNode(l1.val);
                l1 = l1.next;
            } else if (l1 == null || l2 != null && l2.val <= l1.val){
                tmp = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                return head;   //需要这句话来通过编译
            }
            tmp.next = null;
            listNode.next = tmp;
            listNode = tmp;
        }
        return head;
    }
}
