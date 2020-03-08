package com.cafe24.applogtest.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class HelloController {

    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public void createApp() {
//        log.info("Hello json log");
//        log.error("This is error");
//        log.warn("this is warn");
        throw new NullPointerException("TEST!@!@");
    }
}
