package edu.ouc.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Marson
 * @date 2024/6/22
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void edu.ouc.dao.BookDao.update())")
    private void pt(){}

    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
