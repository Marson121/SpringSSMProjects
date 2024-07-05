package edu.ouc.controller;

import edu.ouc.exception.BusinessException;
import edu.ouc.exception.SystemException;
import edu.ouc.pojo.Book;
import edu.ouc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Marson
 * @date 2024/7/1
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result saveBook(@RequestBody Book book) {
        boolean flag = bookService.saveBook(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result updateBook(@RequestBody Book book) {
        boolean flag = bookService.updateBook(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        boolean flag = bookService.deleteById(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        // 模拟业务异常，将其包装成自定义异常
        if (id==1){
            throw new BusinessException(Code.BUSINESS_ERR, "抛出业务异常");
        }

        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "查询失败！请重试！";
        return new Result(code, book, msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> list = bookService.getAll();
        Integer code = list != null ? Code.GET_OK : Code.GET_ERR;
        String msg = list != null ? "" : "查询失败！请重试！";
        return new Result(code, list, msg);
    }
}
