package com.maker.web.admin.feign.service;

import com.maker.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/4/30
 * @Description: com.maker.web.admin.feign.service
 * @version: 1.0
 */
@FeignClient(value = "spring-cloud-service-admin",fallback = AdminServiceHystrix.class)//服务提供者名称
public interface AdminServcie {

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(@RequestParam(value = "message") String meassage);
}
