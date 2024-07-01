package edu.ouc.service.Impl;

import edu.ouc.pojo.User;
import edu.ouc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Marson
 * @date 2024/6/25
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("user service");
    }
}
