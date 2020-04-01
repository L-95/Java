
public class LinkedList {
    public ListNode tmpHead = new ListNode(-1);
    public ListNode tmpLast = new ListNode(0);

    public LinkedList() {

    }

    //头插法
    public void addFirst(int val) {
        ListNode cur = new ListNode(val);
        if (this.tmpHead.next == null) {
            this.tmpHead.next = cur;
            this.tmpLast.prev = cur;
        }else {
            cur.next = this.tmpHead.next;
            this.tmpHead.next.prev = cur;
            this.tmpHead.next = cur;
        }
    }

    //尾插法
    public void addLast(int val) {
        ListNode cur = new ListNode(val);
        if (this.tmpLast.prev == null) {
            this.tmpLast.prev = cur;
            this.tmpHead.next = cur;
        }else {
            cur.prev = this.tmpLast.prev;
            this.tmpLast.prev.next = cur;
            this.tmpLast.prev = cur;
        }
    }

    //任意位置插入
    public void addAll(int data,int val) {
        if (isTrue(data)) {
            System.out.println("data位置不合法");
            return;
        }
        ListNode node = new ListNode(val);
        ListNode cur = this.tmpHead.next;
        if (data == 0) {
            addFirst(val);
        }else if (data == size()) {
            addLast(val);
        }else {
            while (data != 0) {
                cur = cur.next;
                data--;
            }
            node.prev = cur.prev;
            node.next = cur;
            cur.prev = node;
            node.prev.next = node;
        }
    }

    //判断增删位置是否合法
    private boolean isTrue(int data) {
        if (data < 0 || data > size()) {
            return true;
        }
        return false;
    }

    //获取链表长度
    private int size() {
        ListNode cur = this.tmpHead.next;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //从头打印
    public void headDisplay() {
        ListNode cur = this.tmpHead.next;
        while(cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    //从尾打印
    public void lastDisplay() {
        ListNode cur = this.tmpLast.prev;
        while(cur != null) {
            System.out.println(cur.val);
            cur = cur.prev;
        }
    }

    //清空链表
    public void clear() {
        this.tmpHead.next = null;
        this.tmpLast.prev = null;
    }
}
