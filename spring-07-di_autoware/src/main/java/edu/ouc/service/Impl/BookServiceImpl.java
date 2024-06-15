package edu.ouc.service.Impl;

import edu.ouc.dao.BookDao;
import edu.ouc.service.BookService;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class BookServiceImpl implements BookService{
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service dao");
        bookDao.save();
    }

    // 自动装配依赖setter注入，不能省略
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
