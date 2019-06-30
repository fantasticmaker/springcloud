package com.maker.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/5/1
 * @Description: com.maker.zipkin
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient//服务注册到Eureka注册中心
@EnableZipkinServer//服务链路追踪
public class ZipKinApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZipKinApplication.class,args);
    }
}
