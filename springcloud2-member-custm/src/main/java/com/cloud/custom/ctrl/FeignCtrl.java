package com.cloud.custom.ctrl;


import com.cloud.custom.feignApi.FeignApi;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FeignCtrl {

    @Resource
    FeignApi feignApi;

    @RequestMapping(value = "/feign")
    public List<Map<String,Object>>  feign(){
        List<Map<String,Object>> list=new ArrayList<>();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("username","名字");
        list.add(map);
        return feignApi.getUserList(list);
    }

    @RequestMapping(value = "/get")
    public ResponseEntity<Map<String,Object>> getMaps(){
        return feignApi.get();
    }
}
