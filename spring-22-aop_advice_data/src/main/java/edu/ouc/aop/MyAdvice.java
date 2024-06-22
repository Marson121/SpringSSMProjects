package edu.ouc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Marson
 * @date 2024/6/22
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* edu.ouc.dao.*Dao.*(..))")
    private void pt(){}

    // 1.非环绕通知获取参数
    // @Before("pt()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before");
    }

    // @After("pt()")
    public void after(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after");
    }

    // 2.环绕通知获取参数
    // 3.环绕通知获取返回值
    // 5.环绕通知获取异常
    // @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        Object ret = null;
        try {
            ret = pjp.proceed();
        } catch (Throwable t){
            t.printStackTrace();
        }
        return ret;
    }

    // 4.返回后通知获取返回值
    // @AfterReturning(value = "pt()", returning = "ret")
    public void afterReturning(JoinPoint jp, Object ret){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after returning " + ret);
    }

    // 6.抛出异常后通知获取异常
    @AfterThrowing(value = "pt()", throwing = "t")
    public void afterThrowing(JoinPoint jp, Throwable t){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after throwing " + t);
    }
}
