package edu.ouc.service.Impl;

import edu.ouc.dao.LogDao;
import edu.ouc.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marson
 * @date 2024/6/24
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    @Override
    public void log(String in, String out, double money) {
        logDao.log("转账操作由" + out + "到" + in + ",金额：" + money);
    }
}
