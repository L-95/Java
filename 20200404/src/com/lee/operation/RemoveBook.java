package com.lee.operation;

import com.lee.book.BookList;

public class RemoveBook implements Work{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
    }
}
