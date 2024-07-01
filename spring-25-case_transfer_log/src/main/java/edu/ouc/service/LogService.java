package edu.ouc.service;


import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Marson
 * @date 2024/6/24
 */

public interface LogService {

    // 让日志跟其他业务属于不同事务
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(String in, String out, double money);
}
