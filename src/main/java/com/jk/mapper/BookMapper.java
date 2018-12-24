/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BookMapper
 * Author:   zyl
 * Date:     2018/12/21 14:30
 * Description:
 * History:
 */
package com.jk.mapper;

import com.jk.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper extends JpaRepository<Book,Integer > {

    @Query(value="select b.bookId,b.book_name,b.bookDate,b.bookType,b.bookUrl from Book b")
    List<Book> queryBookListAnnotion();
}
