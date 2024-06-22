package edu.ouc.service.Impl;

import edu.ouc.dao.AccountDao;
import edu.ouc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marson
 * @date 2024/6/22
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String out, String in, double money) {
        accountDao.outMoney(out, money);
        // int i = 1 / 0;
        accountDao.inMoney(in, money);
    }
}
