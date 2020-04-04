package com.lee.operation;

import com.lee.book.BookList;

public class ReturnBook implements Work {

    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
    }
}
