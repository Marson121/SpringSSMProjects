package edu.ouc.dao.Impl;

import edu.ouc.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Marson
 * @date 2024/6/16
 */

@Repository("bookDao1")
public class BookDaoImpl implements BookDao {

    // 基本数据类型和String注入
    // @Value("zhangsan")
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book dao1 save " + name);
    }
}
