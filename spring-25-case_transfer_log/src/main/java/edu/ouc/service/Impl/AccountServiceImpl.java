package edu.ouc.service.Impl;

import edu.ouc.dao.AccountDao;
import edu.ouc.service.AccountService;
import edu.ouc.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marson
 * @date 2024/6/24
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    @Override
    public void transfer(String in, String out, double money) {
        try {
            accountDao.outMoney(out, money);
            accountDao.inMoney(in, money);
        } finally {
            logService.log(in, out, money);
        }
    }
}
