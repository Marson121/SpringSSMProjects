package edu.ouc.dao.Impl;

import edu.ouc.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author Marson
 * @date 2024/6/19
 */

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save");
        System.out.println(System.currentTimeMillis());
    }

    @Override
    public void update() {
        System.out.println("book dao update");
    }
}
