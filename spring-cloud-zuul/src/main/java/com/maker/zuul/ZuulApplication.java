package com.maker.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/4/30
 * @Description: com.maker.zuul
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient//eureka客户端
@EnableZuulProxy//zuul 网关API
public class ZuulApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZuulApplication.class,args);
    }
}
