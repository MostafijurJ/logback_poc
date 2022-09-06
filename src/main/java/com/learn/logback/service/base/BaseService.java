package com.learn.logback.service.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BaseService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public String helloService(String serviceName, String methodName) {
        System.out.println("helloService");
        logger.error("Hello from error log!");
        logger.trace("Hello from trace log!");
        logger.debug("Hello from debug log!");
        logger.info("Hello from info log!");
        logger.warn("Hello from warn log!");
        int[] array = new int[2];

        array[0] = 1;
        array[1] = 2;

        return "Hello from " + serviceName + "." + methodName + "  /t array index (" + array[1] +")";
    }
}
