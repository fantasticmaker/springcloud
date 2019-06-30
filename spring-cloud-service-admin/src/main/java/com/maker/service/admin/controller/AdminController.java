package com.maker.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/4/30
 * @Description: com.maker.service.admin.controller
 * @version: 1.0
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(String message){
        return String.format("Hello,your message is :[%s] port :[%s]",message,port);
    }
}
