package leyou.cloud.cus.ctrl;

import leyou.cloud.cus.fegin.ProCtrlFegin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CusCtrl {

    @Resource
    ProCtrlFegin proCtrlFegin;

    @RequestMapping(value = "/cusTest")
    public String cusTest(){
        return "我调用服务端，它给我返回信息是>>>>>"+ proCtrlFegin.proTest();
    }
}
