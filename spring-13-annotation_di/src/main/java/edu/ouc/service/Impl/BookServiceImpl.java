package edu.ouc.service.Impl;

import edu.ouc.dao.BookDao;
import edu.ouc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Marson
 * @date 2024/6/16
 */

@Service
public class BookServiceImpl implements BookService {
    // 自动装配，spring按照类型自动给bookDao注入
    @Autowired
    // 多个同类型的bean需要起名称，然后使用Qualifier指定具体哪一个
    @Qualifier("bookDao2")
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }

    // @Autowired通过暴力反射注入，不需要使用setter方法
    // public void setBookDao(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }
}
