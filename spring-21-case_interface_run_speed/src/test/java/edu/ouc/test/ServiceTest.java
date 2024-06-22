package edu.ouc.test;

import edu.ouc.config.SpringConfig;
import edu.ouc.pojo.Account;
import edu.ouc.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Marson
 * @date 2024/6/21
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ServiceTest {

    @Autowired
    private AccountService accountService;


    @Test
    public void testFindById(){
        System.out.println(accountService.findById(2));
    }

    @Test
    public void testFindAll(){
        System.out.println(accountService.findAll());
    }

    @Test
    public void testSave(){
        Account account = new Account();
        account.setName("masong");
        account.setMoney(30000);

        accountService.save(account);
    }

    @Test
    public void testUpdate(){
        Account account = new Account();
        account.setId(6);
        account.setName("masong");
        account.setMoney(50000);

        accountService.update(account);
    }

    @Test
    public void testDeleteById(){
        accountService.deleteById(6);
    }
}
