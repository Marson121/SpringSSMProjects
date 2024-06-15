package edu.ouc.service.Impl;

import edu.ouc.dao.BookDao;
import edu.ouc.dao.Impl.BookDaoImpl;
import edu.ouc.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service dao");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("setter");
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    // setter比初始化先执行
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
