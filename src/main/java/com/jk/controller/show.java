package com.jk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class show {

    @RequestMapping("BookList")
    public  String  BookList(){
        return  "showBook";
    }
}
