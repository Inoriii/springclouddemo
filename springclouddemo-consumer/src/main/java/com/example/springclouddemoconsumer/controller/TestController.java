package com.example.springclouddemoconsumer.controller;

import com.example.springclouddemoconsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
    * @author wangbin
    * @date 2020/12/26
*/
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "test")
    public String getConsumer(){
       String str =  testService.getProduct();
       return str;
    }
}
