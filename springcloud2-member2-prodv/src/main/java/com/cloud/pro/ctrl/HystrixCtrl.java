package com.cloud.pro.ctrl;


import com.cloud.pro.hystrixBase.HystrixBase;
import com.cloud.util.ResponseBase;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;
import java.util.Map;

@RestController
@RequestMapping(value = "/hystrix")
public class HystrixCtrl extends HystrixBase {
    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    @HystrixCommand(fallbackMethod = "baseException2")
    public ResponseBase getUser(){
        try {
            Thread.sleep(1500);
        }catch (Exception e){

        }
        Map<String,Object> map=new Hashtable<>();
        map.put("name","吴永杰"+port);
        map.put("age",12);
        return new ResponseBase(100,"成功",map);
    }


    public ResponseBase baseException2(){
        return new ResponseBase(-1,"服务器繁忙，请稍后重试"+port,"繁忙了，歇会");
    }
}
