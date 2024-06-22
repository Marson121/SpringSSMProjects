package edu.ouc.dao.Impl;

import edu.ouc.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author Marson
 * @date 2024/6/20
 */

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void update() {
        // int i = 1/0;
        System.out.println("book dao update");
    }

    @Override
    public int select() {
        System.out.println("book dao select");
        return 100;
    }
}
