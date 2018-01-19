package com.zyt.microserviceprovideruser.controller;

import com.zyt.microserviceprovideruser.entity.User;
import com.zyt.microserviceprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhayangtao
 * @version 1.0
 * @since 2018/1/18
 */
@RestController
public class UserController {

    @Autowired
    private Registration registration;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return this.userRepository.findOne(id);
    }

    @GetMapping("/instance-info")
    public ServiceInstance showInfo() {
        List<ServiceInstance> list = discoveryClient.getInstances(registration.getServiceId());
        if (!CollectionUtils.isEmpty(list)) {
            return list.get(0);
        }
        return null;
    }
}
