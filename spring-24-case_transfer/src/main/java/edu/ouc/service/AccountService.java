package edu.ouc.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author Marson
 * @date 2024/6/22
 */
public interface AccountService {

    @Transactional
    void transfer(String out, String in, double money);
}
