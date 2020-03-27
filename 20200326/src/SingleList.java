public class SingleList {
    public Node hand;

    public SingleList() {

    }
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = this.hand;
        this.hand = node;
    }
    //尾插法    
    public void addLast(int data){
        Node node = new Node(data);
        if ( this.hand == null) {
            this.hand = node;
            return;
        }
        Node cur = this.hand;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //任意位置插入,第一个数据节点为0号下标    
    public void addIndex(int index,int data) {
        if (index < 0) {
            System.out.println("index位置不合法");
            return;
        }
        Node node = new Node(data);
        if (this.hand == null) { //如果链表为空
            if (index == 0) {  //且index为0 直接替换hand
                this.hand = node;
            }
            return; //index非零 ，链表为空 那么返回
        }else if (index == 0) { // 链表非空 index为零 调用头插法
            this.addFirst(data);
            return;
        }
        int count = 0;
        Node cur = this.hand;
        while(count < index - 1) {
            cur = cur.next;
            if (cur == null) {
                System.out.println("index位置不合法");
                return;
            }
            count++;
        }
        node.next = cur.next;
        cur.next = node;
    }
    //查找是否包含关键字key是否在单链表当中    
    public boolean contains(int key){
        if (this.hand == null) {
            return false;
        }
        Node cur = this.hand;
        while ( cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点    
    public void remove(int key){
        if (this.hand == null) {
            return;
        }

        Node prev = this.hand;
        Node cur = prev.next;
        if (prev.data == key) {
            this.hand = prev.next;
        }
        while(cur != null) {
            if (cur.data == key) {
                cur = cur.next;
                prev.next = cur;
                return;
            }
            cur = cur.next;
            prev = prev.next;
        }
    }
    //删除所有值为key的节点    
    public void removeAllKey(int key){
        if (this.hand == null) {
            return;
        }
        Node prev = this.hand;
        Node cur = prev.next;
        while(cur != null) {
            if (cur.data == key) {
                cur=cur.next;
                prev.next = cur;
            }else {
                cur = cur.next;
                prev = prev.next;
            }
        }
        if (this.hand.data == key) {
            this.hand = this.hand.next;
        }
    }
    //得到单链表的长度    
    public int size() {
        if (this.hand == null) {
            return -1;
        }
        Node cur = this.hand;
        int size = 0;
        while(cur != null) {
            cur = cur.next;
            size++;
        }
        return size;
    }
    public void display() {
        if (this.hand == null) {
            return;
        }
        Node node = this.hand;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public void clear() {
        this.hand = null;
    }

    }
