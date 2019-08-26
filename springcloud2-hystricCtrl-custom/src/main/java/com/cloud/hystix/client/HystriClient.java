package com.cloud.hystix.client;

import com.cloud.api.HystixApi;
import com.cloud.hystix.fallback.HystriClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "springcloud-hystriy-prod",fallback = HystriClientFallBack.class)
public interface HystriClient extends HystixApi {
}
