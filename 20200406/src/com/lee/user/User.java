package com.lee.user;

import com.lee.book.BookList;
import com.lee.operation.Work;

abstract public class User {

    public String name;

    //数组当中保存每个对象对应的操作
    public Work[] Works;

    public abstract int menu();

    public User(String name) {
        this.name = name;
    }

    public void doWork(int choice, BookList bookList) {
        //通过Works[choice]拿到数组当中元素的对象
        //通过.号work调用bookList对应的方法
        Works[choice].work(bookList);
    }
}
