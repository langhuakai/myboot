package com.wei.springboot.lombok.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class LombokController {

    @RequestMapping("/lombok")
    public String getUser() {
        UserVO user = new UserVO();
        user.setUserId("001");
        user.setUserName("wei");
        user.setAge(26);
        System.out.println(user.getAge());
        log.warn("使用了slf4j注解");
        return user.getUserName();
    }
}
