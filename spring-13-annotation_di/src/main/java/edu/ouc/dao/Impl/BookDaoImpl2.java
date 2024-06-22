package edu.ouc.dao.Impl;

import edu.ouc.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author Marson
 * @date 2024/6/16
 */

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao2 save");
    }
}
