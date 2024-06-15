package edu.ouc.dao.Impl;

import edu.ouc.dao.OrderDao;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("order dao save");
    }
}
