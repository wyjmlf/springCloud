package leyou.cloud.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProApplication.class,args);
    }
}
