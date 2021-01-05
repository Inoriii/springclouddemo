package com.example.springclouddemoentity.entity;

/**
 * @author wangbin
 * @date 2020/12/26
 */
public class Product {

    private String name;
    private int age;
    private String address;

    public Product() {
        this.name = "wangbin-product";
        this.age = 24;
        this.address = "beijing";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + address + '\'' +
                '}';
    }
}
