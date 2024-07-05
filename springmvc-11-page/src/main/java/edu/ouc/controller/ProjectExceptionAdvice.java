package edu.ouc.controller;

import edu.ouc.exception.BusinessException;
import edu.ouc.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Marson
 * @date 2024/7/2
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        System.out.println("业务异常"+e+"已经捕获");
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,e对象发送给开发人员
        return new Result(e.getCode(), null, e.getMessage());
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        System.out.println("系统异常"+e+"已经捕获");
        return new Result(e.getCode(), null, e.getMessage());

    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        System.out.println("异常"+e+"已经捕获");
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员,e对象发送给开发人员
        return new Result(Code.SYSTEM_UNKNOW_ERR, null, "系统繁忙，请稍候！！！！");
    }
}
