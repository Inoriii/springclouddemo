package com.example.springclouddemoentity.entity;

/**
 * @author wangbin
 * @date 2020/12/26
 */
public class Consumer {

    private String name;
    private int age;
    private String address;

    public Consumer() {
        this.name = "wangbin-consumer";
        this.age = 24;
        this.address = "beijing";
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + address + '\'' +
                '}';
    }
}
