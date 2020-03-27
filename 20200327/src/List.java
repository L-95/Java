public class List {
    public Node head;

    public List() {
    }
    //删除链表中等于给定值 **val** 的所有节点。
    public void remove(int val) {
        if (this.head == null) {
            return;
        }
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null) {
            if (cur.data == val) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                cur = cur.next;
                prev = prev.next;
            }
        }
        if (this.head.data == val) {
                this.head = this.head.next;
        }
    }
    //反转一个单链表
    public void reverseList() {
        Node prev = null;
        Node cur = this.head;
        while(cur != null) {
            Node curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
    }

    //链表的中间节点
    public Node mid() {
        Node cur = this.head;
        Node prev = this.head;
        while(cur != null && cur.next != null) {
            cur = cur.next.next;
            prev = prev.next;
        }
        return prev;
    }

    //输出链表中倒数第K个节点
    public Node findK(int k) {
        if (k == 0 || this.head ==null) {
            return null;
        }
        Node prev = this.head;
        Node cur = this.head;
        while(k > 0) {
            if (cur == null) {
                return null;
            }
            cur = cur.next;
            k--;
        }
        while(cur.next != null) {
            cur = cur.next;
            prev = prev.next;
        }
        return prev;
    }

    //将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public Node twoList(Node n1,Node n2) {
        Node head = new Node(0);

        Node prev = head;
        while(n1 != null && n2 != null) {
            if (n1.data <= n2.data) {
                prev.next = n1;
                n1 = n1.next;
            }else {
                prev.next = n2;
                n2 = n2.next;
            }
            prev = prev.next;
        }
        if (n1 == null) {
            prev.next = n2;
        }else {
            prev.next = n1;
        }
        return head.next;
    }
}
