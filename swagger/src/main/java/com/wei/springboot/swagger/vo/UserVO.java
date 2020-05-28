package com.wei.springboot.swagger.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户的网络传输对象")
public class UserVO {

    @ApiModelProperty(value = "用户id")
    private String id;
    @ApiModelProperty(value = "用户名")
    private String name;
    @ApiModelProperty(value = "用户账号")
    private String account;
    @ApiModelProperty(value = "用户密码")
    private String password;
    @ApiModelProperty(value = "用户手机")
    private String phone;
}
