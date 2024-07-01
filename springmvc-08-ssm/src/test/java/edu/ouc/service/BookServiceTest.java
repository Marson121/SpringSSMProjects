package edu.ouc.service;

import edu.ouc.config.SpringConfig;
import edu.ouc.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Marson
 * @date 2024/7/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testSaveBook(){
        Book book = new Book();
        book.setName("Python入门");
        book.setType("计算机技术");
        book.setDescription("叫你快速入门python");

        bookService.saveBook(book);
    }

    @Test
    public void testUpdate(){
        Book book = new Book();
        book.setId(13);
        book.setName("python入门");
        book.setType("计算机技术");
        book.setDescription("30天教你快速入门python");

        bookService.updateBook(book);
    }

    @Test
    public void testDeleteById(){
        bookService.deleteById(13);
    }

    @Test
    public void testGetById(){
        System.out.println(bookService.getById(1));
    }

    @Test
    public void testAll(){
        System.out.println(bookService.getAll());
    }
}
