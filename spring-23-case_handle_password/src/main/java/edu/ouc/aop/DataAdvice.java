package edu.ouc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Marson
 * @date 2024/6/22
 */
@Component
@Aspect
public class DataAdvice {

    @Pointcut("execution(boolean edu.ouc.service.*Service.*(..))")
    private void servicePt(){}

    @Around("servicePt()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        // 获取参数列表
        Object[] args = pjp.getArgs();
        // 判断参数是否为字符串，然后去除空格
        for (int i = 0; i < args.length; i++) {
            if (args[i].getClass().equals(String.class)){
                args[i] = args[i].toString().trim();
            }
        }
        // 将修改后的参数传回原始调用
        return pjp.proceed(args);
    }

}
