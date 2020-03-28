
public class List {

    Node head;
    public List() {

    }
    //判断链表回文
    public boolean palindrome() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node cur = slow.next;
        while(cur != null) {
            Node curNext = slow.next.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while(this.head!= slow && this.head.next!= slow) {
            slow = slow.next;
            this.head = this.head.next;
            if (this.head.val != slow.val) {
                return false;
            }
        }
        return true;
    }

    //删除链表的重复节点
    public Node deleteDuplication() {
        Node node = new Node(-1);
        Node prev = node;
        Node cur = this.head;
        while(cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while( cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else{
                prev.next = cur;
                prev = cur;
                cur = cur.next;
            }
        }
        prev.next = null;
        return node.next;
    }

    //链表分割
    public Node partition( int x) {
        Node node = new Node(-1);
        Node tmp = new Node(-1);
        Node aS = node;
        Node bS = tmp;
        Node cur = this.head;
        while(cur != null) {
            if (cur.val < x) {
                aS.next = cur;
                 aS = aS.next;
            }else {
                bS.next = cur;
                bS = bS.next;
            }
            cur = cur.next;
        }
        bS.next = null; // 一定要将 大于x的这一段的末尾next置为null，否则成为环形链表，死循环了；
        aS.next = tmp.next;
        return node.next;
    }

    //输入两个链表 找出他们第一个公共节点
    public Node getIntersectionNode(Node headA, Node headB) {
        Node cur = headA;
        int count = 0;
        while(cur != null) {
            cur = cur.next;
            count++;
        }
        cur = headB;
        int tmp = 0;
        while(cur != null) {
            cur = cur.next;
            tmp++;
        }
        Node fast = headA;
        Node slow = headB;
        if (count > tmp) {
            int k = count - tmp;
            while(k > 0) {
                fast = fast.next;
                k--;
            }
            while(fast != slow) {
                fast = fast.next;
                slow = slow.next;
                if (fast == null || slow == null) {
                    return null;
                }
            }
            return fast;
        }else {
            int k = tmp - count;
            fast = headB;
            slow = headA;
            while(k > 0) {
                fast = fast.next;
                k--;
            }
            while(fast != slow) {
                fast = fast.next;
                slow = slow.next;
                if (fast == null || slow == null) {
                    return null;
                }
            }
            return fast;
        }
    }
}
