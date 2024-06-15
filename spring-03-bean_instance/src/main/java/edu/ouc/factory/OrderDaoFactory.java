package edu.ouc.factory;

import edu.ouc.dao.Impl.OrderDaoImpl;
import edu.ouc.dao.OrderDao;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class OrderDaoFactory {
    public OrderDao getOrderDao(){
        System.out.println("order dao factory中的一些对对象的其他操作");
        return new OrderDaoImpl();
    }
}
