package edu.ouc.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author Marson
 * @date 2024/6/24
 */
public interface AccountService {

    // 开启spring事务
    @Transactional
    void transfer(String in, String out, double money);
}
