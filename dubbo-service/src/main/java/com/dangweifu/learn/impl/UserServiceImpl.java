package com.dangweifu.learn.impl;

import com.dangweifu.learn.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * IntelliJ IDEA learnDubbo
 * 类描述
 *
 * @author dwf
 * @version 1.0
 * @company 浙江省杭州市阿优文化科技有限公司
 * @date 2023/12/7 10:32
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        ThreadLocal<Object> threadLocal = new ThreadLocal<>();
        return "dang wei fu:hello";
    }

    private static volatile int s ;
    public static void main(String[] args) {

        ThreadLocal<Object> a1 = new ThreadLocal<>();
        ThreadLocal<Object> a2 = new ThreadLocal<>();
        ThreadLocal<Object> a3 = new ThreadLocal<>();

        Thread thread = Thread.currentThread();

        a1.set("123");
        a2.set("111");
        a3.set("222");
        System.out.println(thread);
    }

}