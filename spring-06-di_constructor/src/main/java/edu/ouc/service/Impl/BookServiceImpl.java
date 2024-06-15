package edu.ouc.service.Impl;

import edu.ouc.dao.BookDao;
import edu.ouc.dao.Impl.BookDaoImpl;
import edu.ouc.dao.UserDao;
import edu.ouc.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("book service dao");
        bookDao.save();
        userDao.save();
    }

    // 构造器注入
    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }
}
