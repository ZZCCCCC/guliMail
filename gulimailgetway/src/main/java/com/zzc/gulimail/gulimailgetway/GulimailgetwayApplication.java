package com.zzc.gulimail.gulimailgetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*
    1.开启注册发现
    2.配置nacos注册中心地址
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class GulimailgetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailgetwayApplication.class, args);
    }

}
