/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lee
 * Date: 2020-03-23
 * Time: 18:57
 */

//节点类
class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
//单链表
public class MyLinedList {

    public Node head;

    public MyLinedList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        Node tmp = new Node(data);
        if (index ==0) {
            tmp.next = this.head;
            this.head = tmp;
            return;
        }else if (this.head == null) {
            return;
        }
        Node cur = this.head;
        int count = 0;
        while(count < index -1 ) {
            count++;
            cur = cur.next;
        }
        tmp.next = cur.next;
        cur.next = tmp;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        if (this.head != null) {
            Node cur = this.head;
            while(cur != null) {
                if (cur.data == key) {
                    return true;
                }
                cur = cur.next;
            }
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head == null) {
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node cur = this.head;
        Node cur2 = this.head.next;
        while (cur2 != null) {
            if (cur2.data == key) {
                cur.next = cur2.next;
                return;
            }
            cur = cur.next;
            cur2 = cur2.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (this.head != null) {
            Node prev = this.head;
            Node cur = prev.next;
            while(cur != null) {
                if (cur.data == key) {
                    prev.next = cur.next;
                    cur = cur.next;
                }else {
                    cur = cur.next;
                    prev = prev.next;
                }
            }
            if (this.head.data == key) {
                this.head = this.head.next;
            }
        }
    }

    //得到单链表的长度
    public int size(){
        if (this.head == null) {
            return -1;
        }
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //打印单链表
    public void display(){
        Node tmp = this.head;
        while(tmp != null) {
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
        }
    }
    public void clear(){

    }
}