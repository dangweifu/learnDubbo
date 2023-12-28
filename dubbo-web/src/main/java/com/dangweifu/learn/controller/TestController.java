package com.dangweifu.learn.controller;

import com.dangweifu.learn.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IntelliJ IDEA learnDubbo
 * 类描述
 *
 * @author dwf
 * @version 1.0
 * @company 浙江省杭州市阿优文化科技有限公司
 * @date 2023/12/7 11:16
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Reference
    private UserService userService;

    @RequestMapping("/sayHello")
    public String test(){
        return userService.sayHello();
    }

}