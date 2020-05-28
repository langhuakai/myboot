package com.wei.springboot.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/spring-boot")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/home")
    public String hello() {
       // System.out.println("haha");
        logger.debug("--------------debug------------");
        logger.info("--------------info------------");
        logger.warn("--------------warn------------");
        logger.error("--------------error------------");
        return "hello";
    }
}
