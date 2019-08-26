package com.cloud.pro.ctrl;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/feignCtrl")
public class FeignApiCtrl {

    @PostMapping(value = "/getUserList")
    public List<Map<String,Object>>  getUserList( @RequestBody List<Map<String,Object>> list){


        return list;
    }

    @RequestMapping(value = "/get")
    public ResponseEntity<Map<String,Object>> get(){
        Map<String,Object> map=new HashMap<>();
        map.put("name","吴永杰");
        map.put("age",18);
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }
}
