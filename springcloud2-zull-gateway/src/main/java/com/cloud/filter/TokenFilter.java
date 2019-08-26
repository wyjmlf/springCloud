package com.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 定义网关过滤器必须继承ZuulFilter抽象类。
 */
//@Component
public class TokenFilter extends ZuulFilter {

    @Value("${server.port}")
    private String port;
    /**
     * 表示过滤器类型；
     * @return的pre表示在请求之前进行执行
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行的顺序：
     * 当一个请求在同一个阶段存在多个过滤器的时候没这时候每个
     * 过滤器都是拦截此次请求，这里就表示多个过滤器执行的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 判断过滤器是否生效
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 编写过滤器拦截业务逻辑的代码
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        //案列：拦截所有服务的接口，判断服务接口上是否传递了token参数
        //1：获取上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        //2：获取request对象
        HttpServletRequest request = currentContext.getRequest();
        //3：获取token的时候
        String token = request.getParameter("token");
        System.out.println(token+"...................");
        if (StringUtils.isEmpty(token)){
            //4：设置成false就不会调用服务接口，网关直接相应给客户端数据
            currentContext.setSendZuulResponse(false);
            //5：返回错误提示
            currentContext.setResponseBody("token is null");
            //6：返回错误状态码
            currentContext.setResponseStatusCode(401);
            return null;
        }
        System.out.println("网关服务器端口号：：：：："+port);
        return null;
    }
}
