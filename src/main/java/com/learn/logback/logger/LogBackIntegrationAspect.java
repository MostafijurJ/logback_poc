package com.learn.logback.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogBackIntegrationAspect extends CommonIntegrationLoggerAspect {

    @Pointcut("execution(public * com.learn.logback.integration..*.*(..))")
    public void userIntegrationTrace() {
    }

    @Around("userIntegrationTrace()")
    public Object traceUserIntegration(ProceedingJoinPoint joinPoint) throws Throwable {
        return trace(joinPoint);
    }

}
