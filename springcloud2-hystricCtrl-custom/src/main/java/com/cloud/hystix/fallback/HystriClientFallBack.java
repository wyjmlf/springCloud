package com.cloud.hystix.fallback;

import com.cloud.hystix.client.HystriClient;
import com.cloud.util.ResponseBase;
import org.springframework.stereotype.Component;

@Component
public class HystriClientFallBack implements HystriClient {
    @Override
    public ResponseBase getUser() {
        return new ResponseBase(100,"以类的方式做服务降级","类类类！");
    }
}
