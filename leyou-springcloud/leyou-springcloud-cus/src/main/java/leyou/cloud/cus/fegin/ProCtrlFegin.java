package leyou.cloud.cus.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "leyou-pros",fallback = ProCtrlFeginFallback.class)
public interface ProCtrlFegin {

    @RequestMapping(value = "/proTest",method = RequestMethod.GET)
    public String proTest();
}
