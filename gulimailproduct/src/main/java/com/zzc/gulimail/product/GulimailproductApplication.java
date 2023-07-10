package com.zzc.gulimail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 整合mybatis-plus
 * 1.
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 * 2.配置
 *      数据源
 *      配置mybatis-plus
 *          1.扫描mapper @mapperScan
 *          2.告诉xml的位置
 *
 *  逻辑删除：                 logic-delete-value: 1   #代表已删除
 *                           logic-not-delete-value: 0   #代表未删除
 *                      加上 @TableLogic
 */
@SpringBootApplication
@MapperScan("com.zzc.gulimail.product.dao")
@EnableDiscoveryClient
public class GulimailproductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailproductApplication.class, args);
    }

}
