package com.zyt.microserviceconsumermoviefeign.controller;

import com.zyt.microserviceconsumermoviefeign.entity.User;
import com.zyt.microserviceconsumermoviefeign.service.UserFeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhayangtao
 * @version 1.0
 * @since 2018/1/18
 */
@RestController
public class FeignController {

    @Autowired
    private UserFeignClientService userFeignClientService;

    @GetMapping("/feign/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        return this.userFeignClientService.findByIdFeign(id);
    }
}
