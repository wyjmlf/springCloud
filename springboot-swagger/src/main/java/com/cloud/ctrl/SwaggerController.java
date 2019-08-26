package com.cloud.ctrl;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/swagger")
@Api(tags = "SwaggerDemo测试",description = "提供增、删、改、查")
public class SwaggerController {


    @ApiOperation(value = "获取用户信息")
    @GetMapping(value = "/getUserInfo")
    public String getUserInfo(){

        return "获取到用户信息";
    }
}
