package leyou.cloud.pro.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProCtrl {


    @RequestMapping(value = "/proTest",method = RequestMethod.GET)
    public String proTest() throws InterruptedException {

        return "我是服务提供者";
    }
}
