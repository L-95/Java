package cn.lee.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    //实现toString方法
    public static void main(String[] args) {
        int[] arr = new int[scanner()];
        init(arr);
        String ret = myToString(arr);
        System.out.println(ret);
    }
    public static String myToString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i < arr.length - 1) {
                ret +=", ";
            }
        }
        ret += "]";
        return ret;
    }
    //实现 数组拷贝
    public static void main4(String[] args) {
        int[] arr = new int[scanner()];
        init(arr);
        System.out.println(Arrays.toString(copy(arr)));
    }
    public static int[] copy(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        return array;
    }
    //二分查找法
    public static void main3(String[] args) {
        int[] arr = new int[scanner()];
        init(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("arr["+binarySearch(arr, scanner())+"]");
    }
    public static int binarySearch(int[] arr,int fund) {
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] < fund) {
                low = mid + 1;
            }else if (arr[mid] > fund) {
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    //判断数组是否有序
    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5,7,6};
        System.out.println(isOrNoOrder(arr));
    }
    public static boolean isOrNoOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    //冒泡排序优化版
    public static void main1(String[] args) {
        int[] arr = new int[scanner()];
        init(arr);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1;i++) {
            int count = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }
    }
    public static void init(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
    }
    public static int scanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
