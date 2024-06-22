package edu.ouc.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author Marson
 * @date 2024/6/19
 */
// 作为bean由spring管理且标记为aop处理
@Component
@Aspect
public class MyAdvice {

    // 1.定义切入点
    @Pointcut("execution(void edu.ouc.dao.Impl.BookDaoImpl.update())")
    private void pt(){}

    // 2.定义通知
    // 3.制作切面：绑定切入点与通知关系，并指定通知添加到原始连接点的具体执行位置
    @Before("pt()")
    public void printCurrentTime(){
        System.out.println(System.currentTimeMillis());
    }
}
