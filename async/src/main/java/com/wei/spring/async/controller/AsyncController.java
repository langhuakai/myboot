package com.wei.spring.async.controller;

import com.wei.spring.async.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AsyncController {

    @Autowired
    ScoreService scoreService;

    @RequestMapping("/async")
    public String asyncController() {
       // scoreService.addScore();
        scoreService.addScore2();
        System.out.println("返回");
        return "OK";
    }
}
