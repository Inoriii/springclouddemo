package com.example.springclouddemoproduct.controller;

import com.example.springclouddemoentity.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wangbin
 * @date 2020/12/26
 */
@RestController
public class TestController {
    @RequestMapping(value = "test")
    public String getProduct() {
     Product product = new Product();
        return product.toString();
    }
}
