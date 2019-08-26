package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @EnableEurekaClient
 *  本服务启动后会自动注册进eureka服务中
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class CloudProApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudProApplication.class, args);
    }


}
