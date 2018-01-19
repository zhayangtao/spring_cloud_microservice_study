package com.zyt.microserviceconsumermoviefeignwithhystrixstream.controller;

import com.zyt.microserviceconsumermoviefeignwithhystrixstream.entity.User;
import com.zyt.microserviceconsumermoviefeignwithhystrixstream.service.FeignHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhayangtao
 * @version 1.0
 * @since 2018/1/19
 */
@RestController
public class FeignHystrixController {

    @Autowired
    private FeignHystrixService feignHystrixService;

    @GetMapping("/feign/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        return this.feignHystrixService.findByIdFeign(id);
    }
}
