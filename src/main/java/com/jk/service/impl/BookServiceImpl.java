/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BookServiceImpl
 * Author:   zyl
 * Date:     2018/12/21 14:28
 * Description: 实现类
 * History:
 */
package com.jk.service.impl;

import com.jk.mapper.BookMapper;
import com.jk.model.Book;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * 〈一句话功能简述〉<br> 
 * 〈实现类〉
 *
 * @author zyl
 * @create 2018/12/21
 * @since 1.0.0
 */
@Service
public class BookServiceImpl implements BookService{


    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> queryBookList() {
        return bookMapper.findAll();
    }

    @Override
    public void addBook(Book book) {
        bookMapper.save(book);
    }

    @Override
    public void deleteBook(Book  book) {
        bookMapper.delete(book);
    }

    @Override
    public Book queryBookById(Integer bookId) {

        Book book = bookMapper.findOne(bookId);
        return book;
    }

    @Override
    public void updateBook(Book retBook) {
        bookMapper.save(retBook);
    }

    @Override
    public List<Book> queryBookListAnnotion() {
        return bookMapper.queryBookListAnnotion();
    }
}
