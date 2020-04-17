package com.lee.test;

import java.util.Arrays;

public class MyArrayList {
    private Object[] array;
    private int usedSize;
    public MyArrayList(int n) {
        this.array = new Object[n];
        this.usedSize = 0;
    }

    //扩容
    private void extendCapacity() {
        this.array = Arrays.copyOf(this.array,this.array.length*2);
    }

    // 在 pos 位置新增元素
    public void add(int pos, Object data) {
        //判断pos位置是否合法
        if (this.isTrue(pos)) {
            return;
        }
        //如果表已满 那么扩容
        if (usedSize >= array.length) {
            extendCapacity();
        }
        //插入
        for (int i = this.usedSize; i >= 0; i--) {
            if (i == pos) {
                this.array[i] = data;
                this.usedSize++;
                return;
            }
            this.array[i] = this.array[i-1];
        }
    }

    // 判定是否包含某个元素  
    public boolean contains(Object toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.array[i]) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置  
    public Integer search(Object toFind) {
        for (int i = 0 ; i < this.usedSize; i++) {
            if (this.array[i] == toFind) {
                return i;
            }
        }
        return null;
    }

    // 获取 pos 位置的元素  
    public Object getPos(int pos) {
        //判断pos位置是否合法
        if (pos >=0 && pos < this.usedSize) {
            return this.array[pos];
        }
        return null;
    }

    // 给 pos 位置的元素设为 value  
    public void setPos(int pos, Object value) {
        if (this.isTrue(pos)) {
            return;
        }
        this.array[pos] = value;
    }

    ////删除第一次出现的关键字key
    public void remove(Object toRemove) {
        if (this.usedSize == 0) {
            return;
        }
        for (int i = 0; i < this.usedSize; i++) {
            if (this.array[i] == toRemove) {
                Object tmp = this.array[i];
                this.array[i] = this.array[i+1];
                this.array[i+1] = tmp;
            }
        }
    }

    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //清空顺序表
    public void clear() {
        this.usedSize = 0;
    }

    // 打印顺序表  
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(this.array[i]);
        }
    }

    //判断pos位置是否合法
    private boolean isTrue(int pos) {
        if (pos > usedSize || pos < 0) {
            System.out.println("pos位置不合法");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(10);
        list.add(0,"1234");
        list.add(1,"123");
        list.add(3,"12");
        list.add(-1,"1234");
        list.display();

    }
}
