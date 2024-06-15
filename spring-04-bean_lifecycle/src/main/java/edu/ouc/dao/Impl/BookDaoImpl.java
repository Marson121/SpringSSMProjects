package edu.ouc.dao.Impl;

import edu.ouc.dao.BookDao;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save");
    }

    // 初始化方法，用于在bean创建之后进行一些操作
    public void init(){
        System.out.println("init...");
    }

    // 销毁方法，用于在bean销毁之前进行一些操作
    public void destroy(){
        System.out.println("destroy...");
    }
}
