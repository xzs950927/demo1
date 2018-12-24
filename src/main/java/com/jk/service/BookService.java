/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BookService
 * Author:   zyl
 * Date:     2018/12/21 14:27
 * Description: 接口
 * History:
 */
package com.jk.service;

import com.jk.model.Book;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈接口〉
 *
 * @author zyl
 * @create 2018/12/21
 * @since 1.0.0
 */
public interface BookService {
    List<Book> queryBookList();

    void addBook(Book book);

    void deleteBook(Book  book);

    Book queryBookById(Integer bookId);

    void updateBook(Book retBook);

    List<Book> queryBookListAnnotion();
}
