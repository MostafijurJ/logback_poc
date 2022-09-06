package com.learn.logback.controller;

import com.learn.logback.service.base.BaseService;
import com.learn.logback.service.home.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @Autowired
    private BaseService service;

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String hello() {
        log.info("Calling home service");
        homeService.home();
        log.info("Calling service");
       return service.helloService("logback_trace_aspect", " Hello Controller");
    }
}
