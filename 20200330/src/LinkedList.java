import org.w3c.dom.Node;

import java.util.logging.Logger;

public class LinkedList {
    public ListNode head;

    public LinkedList() {

    }
    //相遇点
    public ListNode hasCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return fast;
            }
        }
        return null;
    }

    //入口点
    public ListNode enter() {
        ListNode fast = this.head;
        ListNode slow = this.head;

        while(fast != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || slow == null) {
            return null;
        }
        slow = this.head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
