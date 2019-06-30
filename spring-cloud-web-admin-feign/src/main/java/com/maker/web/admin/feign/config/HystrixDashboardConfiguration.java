package com.maker.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/4/30
 * @Description: 熔断器仪表盘监控servlet-http://localhost:8765/hystrix.stream
 *
 * @version: 1.0
 */
@Configuration
public class HystrixDashboardConfiguration {

    @Bean
    public ServletRegistrationBean getServlet() {
        //创建servlet
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        //注册servlet
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        //设置参数-类似web.xml
        registrationBean.setLoadOnStartup(1);//优先级
        registrationBean.addUrlMappings("/hystrix.stream");//访问路径
        registrationBean.setName("HystrixMetricsStreamServlet");//servlet名称
        return registrationBean;
    }
}