package com.cloud.custom.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderCtrl {

    /**
     * 在springcloud中有2中方式调用服务提供者，
     * 1)：restTemplate方式：底层采用httpClient
     * 2}：fegin
     */
   @Resource
    RestTemplate restTemplate;

    @RequestMapping(value = "/getOrder")
    public String getMember(){
        String url="http://SPRINGCLOUD-MEMBER-PROD/member/getMember";
        return restTemplate.getForObject(url,String.class);
    }
}
