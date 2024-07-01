package edu.ouc.controller;

import edu.ouc.pojo.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marson
 * @date 2024/7/1
 */
@RestController
@RequestMapping("/books")
public class BookController {

    /**
     * 模拟新增数据，前端携带请求数据请求后端，后端接收后打印即可，模拟新增
     * @param book
     * @return
     */
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save ==> " + book);
        return "{'module: 'book save'}";
    }


    /**
     * 模拟数据库里的数据，前端查询，后端返回数据
     * @return
     */
    @GetMapping
    public List<Book> getAll(){
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setType("计算机");
        book1.setName("SpringMVC入门教程");
        book1.setDescription("小试牛刀");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setType("计算机");
        book2.setName("SpringMVC实战教程");
        book2.setDescription("一代宗师");
        bookList.add(book2);

        Book book3 = new Book();
        book3.setType("计算机丛书");
        book3.setName("SpringMVC实战教程进阶");
        book3.setDescription("一代宗师呕心创作");
        bookList.add(book3);

        return bookList;
    }
}
