package com.cloud.pro.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/member")
public class MemberApiCtrl {












    @RequestMapping(value = "/getMember")
    public String getMember(){
        return "获取到了member信息" ;
    }
}
