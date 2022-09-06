package com.learn.logback.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogBackPerformanceAspect extends CommonPerformanceLoggerAspect {
    @Pointcut("execution(public * com.learn.logback.repository..*.*(..))")
    public void userRepositoryPerformanceTrace() {
    }

    @Around("userRepositoryPerformanceTrace()")
    public Object calculateUserServicePerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        return tracePerformance(joinPoint);
    }
}