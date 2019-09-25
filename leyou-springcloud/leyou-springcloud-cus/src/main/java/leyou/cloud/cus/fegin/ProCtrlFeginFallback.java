package leyou.cloud.cus.fegin;

import org.springframework.stereotype.Component;

@Component
public class ProCtrlFeginFallback implements ProCtrlFegin {
    @Override
    public String proTest() {
        return "远程调用失败";
    }
}
