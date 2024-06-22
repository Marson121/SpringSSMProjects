package edu.ouc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Marson
 * @date 2024/6/20
 */

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void edu.ouc.dao.BookDao.update())")
    public void pt(){}

    @Pointcut("execution(int edu.ouc.dao.BookDao.select())")
    public void pt2(){}


    // @Before("pt()")
    public void beforeMethod(){
        System.out.println("before");
    }

    @After("pt()")
    public void afterMethod(){
        System.out.println("after");
    }

    // 无返回值的环绕通知
    // @Around("pt()")
    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before");
        pjp.proceed();
        System.out.println("around after");
    }

    // @Around("pt2()")
    public Object aroundMethod2(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before");
        Object ret = pjp.proceed();
        System.out.println("around after");

        return ret;
    }

    // 只有方法成功返回后才会增强，出现异常则不会
    // after是不管成功与否都会增强
    // @AfterReturning("pt()")
    public void afterReturningMethod(){
        System.out.println("after returning");
    }

    // 只有抛出异常才会增强，不出现异常不增强
    @AfterThrowing("pt()")
    public void afterThrowingMethod(){
        System.out.println("after throwing");
    }
}
