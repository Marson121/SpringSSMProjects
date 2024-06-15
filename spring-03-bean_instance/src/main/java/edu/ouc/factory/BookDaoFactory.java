package edu.ouc.factory;

import edu.ouc.dao.BookDao;
import edu.ouc.dao.Impl.BookDaoImpl;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class BookDaoFactory {
    public static BookDao getBookDao(){
        System.out.println("book dao factory中的一些对对象的其他操作");
        return new BookDaoImpl();
    }
}
