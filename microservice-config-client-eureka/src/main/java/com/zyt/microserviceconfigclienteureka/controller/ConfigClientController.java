package com.zyt.microserviceconfigclienteureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhayangtao
 * @version 1.0
 * @since 2018/1/19
 * 想要将Config Server 与 注册中心联合使用，
 * 只需要在客户端侧配置spring.cloud.config.discovery.enabled=true
 * 和 spring.cloud.config.discovery.serviceId 两个配置项即可
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/hello")
    public String hello() {
        return profile;
    }
}
