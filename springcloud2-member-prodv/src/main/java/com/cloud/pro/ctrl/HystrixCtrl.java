package com.cloud.pro.ctrl;


import com.cloud.util.ResponseBase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;
import java.util.Map;

@RestController
@RequestMapping(value = "/hystrix")
public class HystrixCtrl {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
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

}
