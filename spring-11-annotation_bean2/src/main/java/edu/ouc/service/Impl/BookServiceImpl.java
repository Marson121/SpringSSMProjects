package edu.ouc.service.Impl;

import edu.ouc.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Marson
 * @date 2024/6/16
 */

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service save");
    }
}
