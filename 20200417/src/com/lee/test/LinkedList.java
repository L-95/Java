package com.lee.test;


class Node{
    public Object val;
    public Node next;
    public Node(Object val){
        this.val = val;
        this.next = null;
    }
}
public class LinkedList {
    Node head;

    public LinkedList() {
    }

    //头插法
    public void addFirst(Object val) {
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(Object val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //打印
    public void dispaly() {
        Node cur = this.head;
        while(cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    //任意位置插入
    public void addData(int data, Object val) {
        if (data < 0 || data >this.size()) {
            System.out.println("data位置不合法！");
        }
        Node node = new Node(val);
        if (this.head == null) {
            if (data == 0) {
                this.head = node;
            }else {
                System.out.println("data位置不合法！");
            }
            return;
        }
        if (data == 0) {
            this.addFirst(val);
            return;
        }
        if (data == this.size()) {
            this.addLast(val);
            return;
        }
        Node cur = this.head;
        int count = 1;
        while(cur.next != null) {
            if (count == data) {
                node.next = cur.next;
                cur.next = node;
            }
            count++;
            cur = cur.next;
        }
//        while(count < (data - 1)){
//            count++;
//            cur = cur.next;
//        }
//        node.next = cur.next;
//        cur.next = node;
    }

    //删除指定位置的节点
    public void removeData(int data) {
        if (this.head == null) {
            return;
        }
        if (data == 0) {
            this.head = this.head.next;
        }
        Node prev = this.head;
        Node cur = this.head.next;
        int count = 1;
        while( cur != null) {
            if (count == data) {
                prev.next = cur.next;
                return;
            }
            count++;
            cur = cur.next;
            prev = prev.next;
        }
    }

    //删除第一次出现的值为val的节点
    public void removeValue(Object val) {
        if (this.head == null) {
            return;
        }
        if (this.head.val == val) {
            this.head = this.head.next;
        }
        Node prev = this.head;
        Node cur = prev.next;
        while(cur != null) {
            //比较的时引用类型 所以需要用equals来比较是否相等 而不能用==
            if (cur.val.equals(val)) {
                prev.next = cur.next;
                return;
            }
            cur = cur.next;
            prev = prev.next;
        }
    }

    //删除所有值为val的节点
    public void removeAllValue(Object val) {
        if (this.head == null) {
            return;
        }
        Node prev = this.head;
        Node cur = prev.next;
        while(cur != null) {
            //比较的时引用类型 所以需要用equals来比较是否相等 而不能用==
            if (cur.val.equals(val)) {
                prev.next = cur.next;
            }else {
                cur = cur.next;
                prev = prev.next;
            }
        }
        if (this.head.val.equals(val)) {
            this.head = this.head.next;
        }
    }

    //查找值为val的节点返回下标 第一个数据节点下标为0
    public Integer findValue(Object val) {
        if (this.head == null) {
            return null;
        }
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            if (cur.val.equals(val)) {
                return count;
            }
            count++;
            cur = cur.next;
        }
        return null;
    }

    //查找下标为data的节点值val 第一个数据节点下标为0
    public Object findData( int data) {
        if (this.head == null) {
            return null;
        }
        Node cur = this.head;
        while(data > 0 && data < this.size()) {
            cur = cur.next;
            data--;
        }
        return cur.val;
    }

    //List长度Size
    public int size() {
        if (this.head == null) {
            return 0;
        }
        int size = 0;
        Node cur = this.head;
        while(cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(1);
        list.addData(4,1);
        list.dispaly();
        System.out.println("----------");
        list.removeData(3);
        list.dispaly();
        System.out.println("-----------");
        list.removeValue(2);
        list.dispaly();
        System.out.println("------------");
        list.removeAllValue(1);
        list.dispaly();
    }
}
