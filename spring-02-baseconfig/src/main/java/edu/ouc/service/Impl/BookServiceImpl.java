package edu.ouc.service.Impl;

import edu.ouc.dao.BookDao;
import edu.ouc.dao.Impl.BookDaoImpl;
import edu.ouc.service.BookService;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
