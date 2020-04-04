package com.lee.operation;

import com.lee.book.BookList;

public class AddBook implements Work{

    @Override
    public void work(BookList bookList) {
        System.out.println("新增书籍");
    }
}
