package edu.ouc.dao.Impl;

import edu.ouc.dao.BookDao;
import org.springframework.stereotype.Component;

/**
 * @author Marson
 * @date 2024/6/16
 */

// 默认不设置名称，获取bean时按照类型获取
@Component
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save");
    }
}
