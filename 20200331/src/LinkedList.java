public class LinkedList {
    public ListNode head;

    public LinkedList() {

    }
    //给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
    public ListNode removeNthFromEnd(int n) {
        ListNode tmp = new ListNode(-1);
        tmp.next = this.head;
        ListNode fast = this.head;
        ListNode slow = this.head;
        ListNode prev = tmp;
        while( n > 0) {
            fast = fast.next;
            n--;
        }
        while( fast != null) {
            fast = fast.next;
            slow = slow.next;
            prev = prev.next;
        }
        if (slow == this.head) {
            return this.head.next;
        }
        prev.next = slow.next;
        return this.head;
    }

    //给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
    //
    //你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
    public ListNode swapPairs() {
        ListNode tmp = new ListNode(-1);
        tmp.next = this.head;
        ListNode node = tmp;
        while(node.next != null && node.next.next != null) {
            ListNode prev = node.next;
            ListNode cur = node.next.next;
            node.next = cur;
            prev.next = cur.next;
            cur.next = prev;

            node = prev;
        }
        return tmp.next;
    }
}
