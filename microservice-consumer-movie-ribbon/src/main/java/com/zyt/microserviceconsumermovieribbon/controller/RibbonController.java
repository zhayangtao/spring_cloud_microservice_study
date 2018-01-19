package com.zyt.microserviceconsumermovieribbon.controller;

import com.zyt.microserviceconsumermovieribbon.entity.User;
import com.zyt.microserviceconsumermovieribbon.service.RibbonService;
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
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id) {
        return this.ribbonService.findById(id);
    }
}
