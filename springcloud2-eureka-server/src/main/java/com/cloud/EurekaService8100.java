package com.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**@EnableEurekaServer：
 *   开启Eureka服务，开启注册中心，接受其它微服务注册进来
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService8100 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService8100.class, args);
    }
}
