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

    // setter注入
    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}
