import java.util.Arrays;

public class MyArrayList {
    private int[] elem;
    private int usedSize;
    private static final int Size = 3;

    public MyArrayList() {
        this.elem = new int [Size];
        this.usedSize = 0;
    }

    //打印顺序表
    public void print() {
        if (this.usedSize == 0) {
            System.out.println("空顺序表");
        }else {
            for (int i = 0; i < this.usedSize; i++) {
                System.out.println(this.elem[i]);
            }
        }
        //System.out.println(Arrays.toString(this.elem));
    }

    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //清空顺序表
    public void clear() {
        this.usedSize = 0;
    }

    //将pos位置的元素设置为value
    public void setPos(int pos , int value) {
        isNull();
        isTrue(pos);
        this.elem[pos] = value;

    }

    //删除第一次出现的关键字key
    public void remove(int key) {
        int i = this.search(key);
        if (i == -1) {
            System.out.println("没有此元素");
            return;
        }
        while(i < this.usedSize - 1) {
            this.elem[i] = this.elem[i+1];
            i++;
        }
        this.usedSize--;
    }

    //判断是否包含某个元素
    public boolean contains(int toFind) {
        isNull();
        for (int i = 0; i < usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind) {
        isNull();
        for (int i = 0; i < usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos) {
        isNull();
        isTrue(pos);
        return this.elem[pos];
    }

    //在pos位置增加元素data
    public void add(int pos, int data) {
        if (isFull()) {
            spread();
            System.out.println("已扩容*2");
        }
        isTrue(pos);
        int i = this.usedSize - 1;
        while(i >= pos) {
            this.elem[i+1]=this.elem[i];
            i--;
        }
        this.elem[pos] = data;
        this.usedSize += 1;
    }

    //扩容
    private void spread() {
        this.elem = Arrays.copyOf(this.elem,(this.elem.length)*2);
        //this.usedSize *= 2;
    }

    //判断是否为满
    private boolean isFull() {
        if(this.usedSize == this.elem.length) {
            System.out.println("顺序表已满");
            return true;
        }
        return false;
    }

    //判断是否为空
    private void isNull() {
        if (this.usedSize == 0 || this.elem == null) {
            throw new NullPointerException("顺序表为空");
        }
    }

    //判断是否合法
    private void isTrue( int pos) {
        if (pos < 0 || pos > usedSize) {
            throw new ArrayIndexOutOfBoundsException("pos位置不合法");
        }
    }
}