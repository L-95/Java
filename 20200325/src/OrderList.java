import java.util.Arrays;

public class OrderList {
    private int[] list;
    private static final int SIZE  = 10;
    private int used;
    public OrderList() {
        this.list = new int[SIZE];
    }

    //打印顺序表
    public void display() {
        for (int i = 0; i < this.used; i++) {
            System.out.println(this.list[i]);
        }
    }

    //任意位置新增元素
    public void add(int data,int num) {
        if (this.isFull(data)) { //判断data位置是否合法
            System.out.println("data位置不合法");
            return;
        }
        if (this.used >= this.list.length) {//判断是否需要扩容
            expansion();
            System.out.println("扩容");
        }
        int i = this.used;
        while (i > data) {//判断是否需要移动元素
            this.list[i] = this.list[i-1];
            i--;
        }
        this.list[i] = num;
        this.used++;
    }
    //顺序表2倍扩容
    public void expansion () {
        this.list = Arrays.copyOf(this.list,this.list.length*2);
    }
    //获取顺序表长度
    public int size() {
        return this.used;
    }
    //清空顺序表
    public void clear() {
        this.used=0;
    }
    //删除第一次出现的元素key
    public void remove(int key) {
       int i = this.search(key);
       if (i != -1) {
           while( i < this.used-1) {
               this.list[i] = this.list[i+1];
               i++;
           }
           this.used--;
       }
    }
    //将data位置的元素设置为value;
    public void setNum(int data,int value) {
        if (this.isFull(data)) {
            System.out.println("data位置不合法");
            return;
        }
        this.list[data] = value;
    }
    //获取data位置的元素
    public int getNum(int data) {
        if (this.isFull(data)) {
            System.out.println("data位置不合法");
            return -1;
        }
        return this.list[data];
    }
    //查找元素num对应的位置
    public int search(int num) {
        for (int i = 0; i < this.used; i++) {
            if (this.list[i] == num) {
                return i;
            }
        }
        return -1;
    }
    //判断是否包含元素num
    public boolean contains(int num) {
        for (int i = 0; i < this.used;i++) {
            if (this.list[i] == num) {
                return true;
            }
        }
        return false;
    }
    //判断data合法性
    public boolean isFull(int data) {
        if (this.used < data) {
            return true;
        }
        return false;
    }
}
