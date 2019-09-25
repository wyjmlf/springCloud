package leyou.cloud.zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class LeyouZullApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouZullApplication.class,args);
    }
}
