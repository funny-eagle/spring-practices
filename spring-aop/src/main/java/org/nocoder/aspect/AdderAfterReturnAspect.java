package org.nocoder.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdderAfterReturnAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * org.nocoder.scheduler.TestScheduler.*(..))")
    public void logPointCut(){}

    @Before("logPointCut()")
    public void doBefore(JoinPoint point)throws Throwable{
        logger.info("do before...");
    }

    @AfterReturning(returning = "returnValue", pointcut = "logPointCut()")
    public void afterReturn(Object returnValue) throws Throwable {
        logger.info("value return was {}",  returnValue);
    }
}