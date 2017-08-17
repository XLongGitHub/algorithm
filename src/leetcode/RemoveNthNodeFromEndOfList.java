package leetcode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode countLen = head;
        ListNode listNode = head;
        while (countLen != null) {
            len++;
            countLen = countLen.next;
        }
//        if (len == 1 && n == 1) return null;
        //删除第一个节点
        if (len == n) return head.next;
        //找到待删除节点的前一个节点
        int pos = len - n - 1;
        for (int i = 0; i < pos; i++) {
            listNode = listNode.next;
        }
        listNode.next = listNode.next.next;
        return head;
    }
}
