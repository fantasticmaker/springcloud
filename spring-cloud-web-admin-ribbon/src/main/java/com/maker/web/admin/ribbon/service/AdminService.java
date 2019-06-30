package com.maker.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.utils.FallbackMethod;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/4/30
 * @Description: com.maker.web.admin.ribbon.service
 * @version: 1.0
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error")//熔断器注解，如果访问失败，跳转至其他方法
    public String test(String message){
        return  restTemplate.getForObject("http://spring-cloud-service-admin/test?message=" + message,String.class);
    }

    public String error(String message){
        return String.format("hello your message is : %s but request bad",message);
    }

}
