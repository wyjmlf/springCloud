package com.cloud.swagger.ctrl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "swagger1服务")
public class SwaggerCtrl {

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    @ApiOperation(value = "获取用户信息")
    public String getUserInfo(){
        return "swagger1服务获取用户信息成功";
    }
}
