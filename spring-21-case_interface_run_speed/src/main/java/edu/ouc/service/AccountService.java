package edu.ouc.service;

import edu.ouc.pojo.Account;

import java.util.List;

/**
 * @author Marson
 * @date 2024/6/21
 */
public interface AccountService {
    void save(Account account);

    void deleteById(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);
}
