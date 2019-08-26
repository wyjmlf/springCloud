package com.cloud.custom.ctrl;

import com.cloud.custom.feignApi.FeignApi;
import com.cloud.util.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HystrixCtrl {

    @Resource
    FeignApi feignApi;

    @RequestMapping(value = "/hystrix")
    public ResponseBase hystrix(){
        return feignApi.getUser();
    }
}
