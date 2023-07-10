package com.zzc.gulimail.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*
    nacos配置中心
        1.引依赖   naocs-config  和bootstrap
        2.在bootstrap.properties配置服务名称和注册中心地址
        3.在配置中心新建配置文件       dataId：服务名称.properties
        4. 加上注解 @RefreshScope      动态刷新配置
        5. @value("${....}")
        6. 配置冲突时，优先使用配置中心的配置
 */
/*
        命名空间：环境隔离
        默认：public(保留空间)
        切换另一个环境
        spring.cloud.nacos.config.namespace=2f049be1-79b7-48c8-aeec-b0bc7ae0b4aa

        每一个微服务创建自己的命名空间  ，只加载自己命名空间下的所有配置

        配置分组：默认属于  DEFAULT_GROUP
        #切换配置中心的分组 默认为DEFAULT_GROUP
            spring.cloud.nacos.config.group=

        每一个微服务创建自己的命名空间   使用配置分组区分不同的环境
 */

/*
            配置集合 可配置多个
            加载哪个配置文件
            spring.cloud.nacos.config.extension-configs[0].data-id=gulimail-coupon.properties
            这个配置文件在哪个组
            spring.cloud.nacos.config.extension-configs[0].group=dev
            是否动态刷新
            spring.cloud.nacos.config.extension-configs[0].refresh=true
 */


@SpringBootApplication
@EnableDiscoveryClient  //开启nacos发现
public class GulimailcouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailcouponApplication.class, args);
    }

}
