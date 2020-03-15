package cn.lee.test;

import java.util.Arrays;

public class Test {
    //给定一个长度，初始化数组，从1开始，每项++；
    public static void main3(String[] args) {
        int [] arr = init(100);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] init(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length;i++) {
            arr[i]=i+1;
        }
        return arr;
    }
    //打印数组中的每个元素的值
    public static void main2(String[] args) {
        int[] arr = init(7);
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        //for (int i : arr) {
        //    System.out.print(i+" ");
        //}

        //System.out.println(Arrays.toString(arr));
    }
    //将数组每个元素的值*2并输出；
    public static void main1(String[] args) {
        int[] arr = init(7);
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=2;
        }
    }
    //求数组中的元素合
    public static void main4(String[] args) {
        int[] arr = init(7);
        sum(arr);
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum;
    }
    //求数组中的元素的平均值
    public static void main5(String[] args) {
        int[] arr = init(7);
        avg(arr);
    }
    public static int avg(int[] arr) {
        int sum=0;
        for (int i = 0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    //自写copy数组方法；
    public static void main6(String[] args) {
        int[] arr = init(7);
        int[] array = copy(arr);
        System.out.println(Arrays.toString(array));
    }
    public static int[] copy(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i<arr.length;i++) {
            array[i] = arr[i];
        }
        return array;
    }
    //copy数组1；
    public static void main7(String[] args) {
        int[] arr = init(7);
        System.out.println(Arrays.toString(Arrays.copyOf(arr,arr.length)));
    }
    //copy数组2；
    public static void main(String[] args) {
        int[] arr = init(7);
        int[] array = new int[arr.length];
        //参数(源数组，从哪个元素开始，目的数组，从哪个元素开始，需要copy的长度);
        System.arraycopy(arr,0,array,0,arr.length-3);
        System.out.println(Arrays.toString(array));
    }
    public static int binarySearch(int[] arr , int fund) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right) {
            int mid = (left+right)/2;
            if (arr[mid] > fund) {
                left = mid+1;
            }
            if (arr[mid] < fund) {
                right = mid-1;
            }
            if (arr[mid] == fund) {
                return mid;
            }
        }
        return -1;
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1;i++) {
            for (int j = 0; j < arr.length-1-i ;j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        //while (left<right)
        for (int i = 0; i<arr.length;i++) {
            if (left<right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }else {
                break;
            }
        }
    }
}
