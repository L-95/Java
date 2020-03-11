package cn.lee.test;

import java.util.Scanner;

public class Test {
    //二分查找
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("请输入要查找的数字：");
        int fund = scanner();
        System.out.println("要查找的数字下标为："+dichotomy(arr,fund));
    }
    public static int dichotomy(int[] arr,int fund) {
        int low = 0;
        int height = arr.length-1;
        while (low<=height) {
            int mid = (low+height)/2;
            if (arr[mid]>fund) {
                height=mid-1;
            }
            if (arr[mid]<fund) {
                low=mid+1;
            }
            if (arr[mid]==fund){
                return mid;
            }
        }
        return -1;
    }

    //快速排序解决奇偶性问题
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        reOrderArray(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void reOrderArray(int [] arr) {
        int low = 0;
        int hight = arr.length-1;
        while(low<hight) {
            while(arr[low]%2!=0) {
                low++;
            }
            while(arr[hight]%2==0) {
                hight--;
            }
            if (low<hight) {
                int count = arr[low];
                arr[low] = arr[hight];
                arr[hight] = count;
            }
        }
    }
    public static int scanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
