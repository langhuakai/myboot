package com.wei.springboot.lombok.controller;

import lombok.Data;

@Data
public class UserVO {

    private String userId;
    private String userName;
    private int age;
}
