/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserController
 * Author:   zyl
 * Date:     2018/12/21 14:10
 * Description: 这是控制层
 * History:
 */
package com.jk.controller;

import com.jk.model.Book;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("user")
public class BookController {


    @Autowired
    private BookService bookService;



    @RequestMapping("queryBookList")
    public List<Book> queryBookList(){
       List<Book> list= bookService.queryBookList();
       return  list;
    }




    @RequestMapping("addBook")
    public  void   addBook(Book  book) {
        if(book.getBookId()!=null) {
            bookService.updateBook(book);
        }else {
            bookService.addBook(book);
        }

    }


    @RequestMapping("delBook")
    public  void deleteBook(String    bookId){
      int   aa=  Integer.parseInt(bookId);
        Book  book  =new  Book();
         book.setBookId(aa);
        bookService.deleteBook(book);
    }


    @RequestMapping("queryHuiBook")
    public Book queryBookById(Integer   bookId) {

        Book retBook=bookService.queryBookById(bookId);
        return retBook;
    }


}
