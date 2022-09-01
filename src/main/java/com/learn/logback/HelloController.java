package com.learn.logback;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String hello() {
        logger.info("Hello from info log!");
        logger.trace("Hello from trace log!");
        logger.error("Hello from error log!");
        return "Hello World";
    }
}
