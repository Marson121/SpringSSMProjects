package edu.ouc.dao.Impl;

import edu.ouc.dao.BookDao;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;

    @Override
    public void save() {
        System.out.println("book dao save " + connectionNum + ", " + databaseName);
    }

    // 构造器注入

    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }
}
