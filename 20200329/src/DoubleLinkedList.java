import java.util.ListResourceBundle;

public class DoubleLinkedList {
    public ListNode head; //头

    public ListNode last; //尾

    //头插法
    public void addFirst(int val) {
        ListNode node = new ListNode(val);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.head.prev = node;
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int val) {
        ListNode node = new ListNode(val);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int val){
        ListNode node = new ListNode(val);
        if (isTrue(index)) {
            return;
        }
        if (index == 0) {
            addFirst(val);
        }else if (index == size()) {
            addLast(val);
        }else {
            ListNode cur = this.head;
            while(index != 0) {
                cur = cur.next;
                index--;
            }
            node.prev = cur.prev;
            node.next = cur;
            cur.prev = node;
            node.prev.next = node;
        }
    }
    //判断index 是否合法
    private boolean isTrue(int index) {
        if (index < 0 || index >size()) {
            System.out.println("index位置不合法");
            return true;
        }
        if (this.head == null) {
            if (index == 0) {
                return false;
            }else {
                System.out.println("index位置不合法");
                return true;
            }
        }
        return false;
    }
    //查找是否包含关键字key是否在双向链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        while(cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur = this.head;
        while( cur != null) {
            if (cur.val == key) {
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else if (cur == this.last) {
                    this.last = this.last.prev;
                    this.last.next = null;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return;
            }else {
                cur = cur.next;
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur = this.head;
        while( cur != null) {
            if (cur.val == key) {
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.last = cur.prev;
                    }
                }
                cur = cur.next;
            }
        }
    }
    //得到双向链表的长度
    public int size(){
        ListNode tmp = this.head;
        int size = 0;
        while( tmp != null) {
            tmp = tmp.next;
            size++;
        }
        return size;
    }
    //打印双向链表
    public void display(){
        ListNode cur = this.head;
        while(cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
    public void clear(){
        this.head = null;
        this.last = null;
    }
}
