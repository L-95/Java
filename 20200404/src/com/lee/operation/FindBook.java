package com.lee.operation;

import com.lee.book.BookList;

public class FindBook implements Work{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
    }
}
