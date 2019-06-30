package com.maker.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/4/30
 * @Description: java的方式创建配置文件，类似xml,
 * 创建configuration标签下的bean标签并指定class的位置
 * @version: 1.0
 *
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced//负载均衡状态
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
