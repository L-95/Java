package com.lee.operation;

import com.lee.book.BookList;

public class EscBookList implements Work {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(0);
    }
}
