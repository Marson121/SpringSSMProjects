package edu.ouc.service;

import edu.ouc.config.SpringConfig;
import edu.ouc.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Marson
 * @date 2024/6/17
 */

// 设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
// 设置Spring环境对应的配置类
@ContextConfiguration(classes = {SpringConfig.class})
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById(){
        System.out.println(accountService.findById(1));
    }

    @Test
    public void testFindAll(){
        System.out.println(accountService.findAll());
    }

    @Test
    public void testSave(){
        Account account = new Account();
        account.setName("Tom");
        account.setMoney(6999);

        accountService.save(account);
    }

    @Test
    public void testUpdate(){
        Account account = new Account();
        account.setId(1);
        account.setName("zhangsan666");
        account.setMoney(19999);

        accountService.update(account);
    }

    @Test
    public void testDeleteById(){
        accountService.deleteById(1);
    }

}
