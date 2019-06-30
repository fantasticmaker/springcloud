package com.maker.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/5/1
 * @Description: com.maker.admin
 * @version: 1.0
 */
@SpringBootApplication
@EnableAdminServer//服务监控admin
@EnableEurekaClient//服务提供者注册到Eureka
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}
