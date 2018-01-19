package com.zyt.microserviceconsumermoviefeign.service;

import com.zyt.microserviceconsumermoviefeign.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhayangtao
 * @version 1.0
 * @since 2018/1/18
 * 使用@FeignClient("microservice-provider-user")注解绑定microservice-provider-user服务，还可以使用url参数指定一个URL。

 */
@FeignClient(value = "microservice-provider-user")// 设置服务提供者名称
public interface UserFeignClientService {

    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);
}
