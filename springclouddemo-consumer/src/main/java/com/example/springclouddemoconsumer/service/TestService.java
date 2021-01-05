package com.example.springclouddemoconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangbin
 * @date 2020/12/26
 */
@FeignClient(name = "product-server",path ="/test" )
@Component
public interface TestService {
    @RequestMapping(value = "test")
    String getProduct();
}
