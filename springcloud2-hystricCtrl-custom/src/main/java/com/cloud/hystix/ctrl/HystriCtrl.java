package com.cloud.hystix.ctrl;

import com.cloud.hystix.client.HystriClient;
import com.cloud.util.ResponseBase;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HystriCtrl {

    @Resource
    HystriClient hystriClient;

    @HystrixCommand(fallbackMethod = "getUserFallBack")
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public ResponseBase getUser(){
        return hystriClient.getUser();
    }


    @RequestMapping(value = "/getUser22",method = RequestMethod.GET)
    public ResponseBase getUser22(){
        return hystriClient.getUser();
    }

    public ResponseBase getUserFallBack(){
        return new ResponseBase(100,"系统繁忙","歇一会");

    }
}
