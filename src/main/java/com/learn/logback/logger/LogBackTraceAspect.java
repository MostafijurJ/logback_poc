package com.learn.logback.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogBackTraceAspect extends CommonTraceLoggerAspect {

    @Pointcut("execution(* com.learn.logback.controller..*(..)))")
    public void logbackControllerAspect() {
    }

    @Pointcut("execution(* com.learn.logback.service..*.*(..)))")
    public void logbackServiceTrace() {
    }

    @Around("logbackServiceTrace()")
    public Object logService(ProceedingJoinPoint joinPoint) throws Throwable {
        return trace(joinPoint);
    }

    @Around("logbackControllerAspect()")
    public Object logController(ProceedingJoinPoint joinPoint) throws Throwable {
        return trace(joinPoint);
    }

}
