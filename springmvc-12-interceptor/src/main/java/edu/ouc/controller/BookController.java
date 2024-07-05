package edu.ouc.controller;

import edu.ouc.pojo.Book;
import org.springframework.web.bind.annotation.*;

/**
 * @author Marson
 * @date 2024/7/5
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save " + book);
        return "book save";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("book delete " + id);
        return "book delete";
    }

    @PutMapping
    public String update(@RequestBody Book book) {
        System.out.println("book update " + book);
        return "book update";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("book getById " + id);
        return "book getById";
    }

    @GetMapping
    public String getAll() {
        System.out.println("book getAll");
        return "book getAll";
    }


}
