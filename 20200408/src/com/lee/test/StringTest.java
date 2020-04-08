package com.lee.test;

//实现方法 compareTo, 能够实现按照字典序比较字符串大小

public class StringTest {
    public static void main(String[] args) {
        CompareTo str = new CompareTo("asd","as");
        System.out.println(str.myCompareTo());
    }
}
class CompareTo{
    private String str1;
    private String str2;
    public CompareTo(String str1,String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String myCompareTo() {
        if (Compare() == 0) {
            return this.str1.length() < this.str2.length() ? this.str1 : this.str2;
        }else if (Compare() == 1) {
            return this.str2;
        }else {
            return this.str1;
        }
    }
    private int Compare() {
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (this.str1.charAt(i) > this.str2.charAt(i)) {
                return 1;
            }else if (this.str1.charAt(i) < this.str2.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }
}