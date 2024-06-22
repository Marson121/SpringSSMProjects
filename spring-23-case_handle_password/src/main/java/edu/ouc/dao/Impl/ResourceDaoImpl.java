package edu.ouc.dao.Impl;

import edu.ouc.dao.ResourceDao;
import org.springframework.stereotype.Repository;

/**
 * @author Marson
 * @date 2024/6/22
 */

@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Override
    public boolean readResources(String url, String password) {
        // 判断用户输入密码是否匹配
        return password.equals("123456");
    }
}
