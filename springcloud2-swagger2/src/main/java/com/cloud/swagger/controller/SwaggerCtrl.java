package com.cloud.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "swagger2服务")
public class SwaggerCtrl {

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    @ApiOperation(value = "获取用户信息")
    public String getUserInfo(){
        return "swagger2服务获取用户信息成功";
    }

    @RequestMapping(value = "/getOrder",method = RequestMethod.POST)
    @ApiOperation(value = "获取订单服务")
    public String getOrder(){
        return "swagger2服务获取订单服务成功";
    }
}
