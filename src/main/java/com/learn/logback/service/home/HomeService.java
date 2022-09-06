package com.learn.logback.service.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HomeService {

    public String home() {

        log.trace("HomeService started");
        log.info("Hello, this is home service");
        return "hello world";
    }


}
