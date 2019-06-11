package com.min.blog.common.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 调用接口打印性能日志以及接口报错之后记录错误日志
 */
@Component
@Aspect
public class InterfaceRequestErrrorAndPerformanceLog {

    public static final Logger logger = LoggerFactory.getLogger(InterfaceRequestErrrorAndPerformanceLog.class);

    @Value("${dc.log.bad.value:3000}")
    private int performanceBadValue;


    @Pointcut("execution(* com.min.blog.*.controller.*.*.*(..)))")
    public void pointCut(){}

    

}
