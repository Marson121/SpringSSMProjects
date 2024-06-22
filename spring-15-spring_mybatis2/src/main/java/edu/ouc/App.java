package edu.ouc;

import edu.ouc.config.SpringConfig;
import edu.ouc.pojo.Account;
import edu.ouc.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author Marson
 * @date 2024/6/17
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        List<Account> ac = accountService.findAll();
        System.out.println(ac);
    }
}
