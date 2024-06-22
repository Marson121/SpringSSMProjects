package edu.ouc.dao.Impl;

import edu.ouc.dao.BookDao;

/**
 * @author Marson
 * @date 2024/6/16
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save");
    }
}
