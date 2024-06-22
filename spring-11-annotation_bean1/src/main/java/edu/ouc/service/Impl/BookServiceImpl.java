package edu.ouc.service.Impl;

import edu.ouc.service.BookService;
import org.springframework.stereotype.Component;

/**
 * @author Marson
 * @date 2024/6/16
 */

// 可以设置名称，获取bean时可以按照名称获取
@Component("bookService")
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service save");
    }
}
