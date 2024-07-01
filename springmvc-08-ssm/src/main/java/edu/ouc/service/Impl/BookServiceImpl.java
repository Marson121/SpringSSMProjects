package edu.ouc.service.Impl;

import edu.ouc.dao.BookDao;
import edu.ouc.pojo.Book;
import edu.ouc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Marson
 * @date 2024/7/1
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean saveBook(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean updateBook(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean deleteById(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
