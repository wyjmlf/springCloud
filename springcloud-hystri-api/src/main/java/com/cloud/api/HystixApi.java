package com.cloud.api;

import com.cloud.util.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface HystixApi {

    @RequestMapping(value = "/hystix/getUser",method = RequestMethod.GET)
    public ResponseBase getUser();
}
