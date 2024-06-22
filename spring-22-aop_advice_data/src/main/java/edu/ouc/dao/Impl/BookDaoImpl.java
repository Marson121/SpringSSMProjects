package edu.ouc.dao.Impl;

import edu.ouc.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author Marson
 * @date 2024/6/22
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id, String name) {
        System.out.println("id: " + id + " name: " + name);
        int i = 1 / 0;
        return "marson";
    }
}
