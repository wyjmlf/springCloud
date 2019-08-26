package com.cloud.swagger;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 注意路由拦截器中会对http://localhost:8317/swagger-ui.html进行拦截，
 * 所以在请求swagger接口文档的时候，先对/swagger-ui.html进行过滤拦截
 */
@SpringBootApplication
@EnableSwagger2Doc
@EnableDiscoveryClient
public class SpringCloudSwaggerApplication2 {

    public static void main(String[] args){
        SpringApplication.run(SpringCloudSwaggerApplication2.class,args);
    }
}
