package com.cloud.hystix.ctrl;

import com.cloud.util.ResponseBase;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hystix")
public class HystixCtrl {

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)

    public ResponseBase getUser() throws InterruptedException {
//        int a=1/0;
        Thread.sleep(5000);
        return new ResponseBase(200,"成功","成功了");
    }


}
