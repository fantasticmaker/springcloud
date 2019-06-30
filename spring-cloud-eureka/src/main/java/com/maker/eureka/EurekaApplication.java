package com.maker.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/4/30
 * @Description: eureka部署单台会出现警告，会产生单点故障，所有euraka建议做成高可用的集群模式
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
