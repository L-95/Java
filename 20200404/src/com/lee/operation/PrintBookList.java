package com.lee.operation;

import com.lee.book.BookList;

public class PrintBookList implements Work {
    @Override
    public void work(BookList bookList) {
        System.out.println("打印书籍列表");
    }

}
