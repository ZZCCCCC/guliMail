package com.zzc.gulimail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/*
远程调用
    1.引入open-feign
    2.编写一个接口，告诉springcloud这个接口需要远程调用
        2.1 . 接口中写远程调用的抽象方法
    3.开启远程调用功能  @EnableFeignClients
 */

@EnableFeignClients(basePackages = "com.zzc.gulimail.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimailmemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailmemberApplication.class, args);
    }

}
