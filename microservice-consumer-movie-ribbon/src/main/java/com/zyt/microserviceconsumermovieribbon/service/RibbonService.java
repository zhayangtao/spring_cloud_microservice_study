package com.zyt.microserviceconsumermovieribbon.service;

import com.zyt.microserviceconsumermovieribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhayangtao
 * @version 1.0
 * @since 2018/1/18
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id) {
        return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
    }
}
