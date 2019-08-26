package com.cloud;


import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;
/**
 * 注意路由拦截器中会对http://localhost:8317/swagger-ui.html进行拦截，
 * 所以在请求swagger接口文档的时候，先对/swagger-ui.html进行过滤拦截
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableSwagger2Doc
public class ZullApplicationGateway {

    public static void main(String[] arg){
        SpringApplication.run(ZullApplicationGateway.class,arg);
    }



    // zuul配置能够使用config实现实时更新
    @RefreshScope
    @ConfigurationProperties("zuul")
    public ZuulProperties zuulProperties() {
        return new ZuulProperties();
    }

    // 添加文档来源
    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider {
        @Override
        public List<SwaggerResource> get() {
            List resources = new ArrayList<>();
            /**
             * swagger1API接口文档：可以随便写
             * "/api-swagger1/v2/api-docs"：前面的api-swagger1是配置文件中path的值
             */
            resources.add(swaggerResource("swagger1API接口文档", "/api-swagger1/v2/api-docs", "2.0"));
            resources.add(swaggerResource("swagger2API接口文档", "/api-swagger2/v2/api-docs", "2.0"));
            return resources;
        }

        private SwaggerResource swaggerResource(String name, String location, String version) {
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }


}
