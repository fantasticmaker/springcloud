package com.maker.web.admin.feign.controller;

import com.maker.web.admin.feign.service.AdminServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/4/30
 * @Description: com.maker.web.admin.feign.controller
 * @version: 1.0
 */
@RestController
public class AdminController {

    @Autowired
    private AdminServcie adminServcie;

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(String message){
        return adminServcie.test(message);
    }
}
