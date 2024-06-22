package edu.ouc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Marson
 * @date 2024/6/21
 */

@Component
@Aspect
public class ServiceAdvice {

    @Pointcut("execution(* edu.ouc.service.*Service.*(..))")
    private void servicePt(){}

    @Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        // 获取执行签名信息
        Signature signature = pjp.getSignature();
        // 通过签名获取操作接口名
        String className = signature.getDeclaringTypeName();
        // 通过签名获取操作方法名
        String methodName = signature.getName();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }

        long end = System.currentTimeMillis();
        System.out.println("万次执行时间： " + className + "." + methodName + " ---> " + (end-start) + "ms");
    }
}
