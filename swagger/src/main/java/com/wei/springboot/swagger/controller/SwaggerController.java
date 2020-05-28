package com.wei.springboot.swagger.controller;

import com.wei.springboot.swagger.vo.UserVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;

@Controller
public class SwaggerController {

    @ApiOperation("获取swagger对象")
    public UserVO getSwagger(@ApiParam("传入用户的id") String id) {
        UserVO userVO = new UserVO();
        userVO.setId("001");
        userVO.setName("wei");
        userVO.setAccount("wei001");
        userVO.setAccount("123456");
        userVO.setPhone("13888888888");
        return userVO;
    }
}
