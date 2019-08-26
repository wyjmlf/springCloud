package com.cloud.custom.feignApi;

 import com.cloud.util.ResponseBase;
 import org.springframework.cloud.openfeign.FeignClient;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import org.springframework.web.bind.annotation.RequestParam;

 import java.util.List;
 import java.util.Map;


/**
 * 是服务提供者得：spring.application.name，
 * 请求地址和方法必须和服务得提供者一致
 */
@FeignClient( "springcloud-member-prod")
public interface FeignApi   {
 @RequestMapping(value = "/feignCtrl/getUserList",method = RequestMethod.POST)
 public List<Map<String,Object>>  getUserList( @RequestBody List<Map<String,Object>> list);

 @RequestMapping(value = "/feignCtrl/get")
 public ResponseEntity<Map<String,Object>> get();

 @RequestMapping(value = "/hystrix/getUser",method = RequestMethod.POST)
 public ResponseBase getUser();
}
