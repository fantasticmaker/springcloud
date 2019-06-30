package com.maker.web.admin.feign.service.hystrix;

import com.maker.web.admin.feign.service.AdminServcie;
import org.springframework.stereotype.Component;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/4/30
 * @Description: com.maker.web.admin.feign.service.hystrix
 * @version: 1.0
 */
@Component
public class AdminServiceHystrix implements AdminServcie {

    public String test(String meassage) {
        return String.format("Hello your message is : %s but request bad",meassage);
    }
}
