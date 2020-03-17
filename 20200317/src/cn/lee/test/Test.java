package cn.lee.test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        remove(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    //删除第一次出现的关键词key
    public static void remove(int[] arr,int key) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == key) {
                arr[i] = arr[i+1];
                i++;
            }
            arr[i] = arr[i+1];
        }
        if (arr[arr.length-1] == key) {
            arr[arr.length] = 0;
        }
    }
    //清空数组
    public static void clear(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    //获取数组长度
    public static int size(int[] arr) {
        return arr.length;
    }
    //获取pos位置的元素
    public static int getPos(int[] arr, int pos) {
        return arr[pos];
    }
    //查找某个元素对应的下标
    public static int search(int[] arr, int find) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return arr[i];
            }
        }
        return -1;
    }
    //打印数组
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //在指定位置添加某个数字(尚未完善)
    /*public static int[] add(int[] arr, int pos, int data) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        if (count < arr.length) {
            for (int n = count + 1; n > pos; n--) {
                arr[n] = arr[n-1];
            }
            arr[pos] = data;
            return arr;
        }else {
            int[] array = new int[2*arr.length];
            System.arraycopy(arr,0,array,0,2*arr.length);
            for (int n = count +1; n > pos; n--) {
                array[n] = array[n-1];
            }
            array[pos] = data;
            return array;
        }
    }*/
    //判断是否包含某个元素
    public static boolean contains(int[] arr,int find) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return true;
            }
        }
        return false;
    }
    //将pos位置的元素设置为value
    public static void setPos(int[] arr,int pos,int value) {
        arr[pos] = value;
    }
}
