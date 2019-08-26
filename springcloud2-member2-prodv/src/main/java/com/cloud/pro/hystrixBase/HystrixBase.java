package com.cloud.pro.hystrixBase;

import com.cloud.util.ResponseBase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HystrixBase {

    @Value("${server.port}")
    String port;

    public ResponseBase baseException(){
        return new ResponseBase(-1,"服务器繁忙，请稍后重试"+port,"繁忙了，歇会");
    }
}
