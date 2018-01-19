package com.zyt.microserviceconsumermoviefeignwithhystrix.service;

import com.zyt.microserviceconsumermoviefeignwithhystrix.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhayangtao
 * @version 1.0
 * @since 2018/1/18
 * 使用@FeignClient注解的fallback属性，指定fallback类
 */
@FeignClient(name = "microservice-provider-user", fallback = FeignHystrixService.HystrixClientFallback.class)
public interface FeignHystrixService {

    @RequestMapping("/{id}")
    User findByIdFeign(@RequestParam("id") Long id);

//    @Component
    class HystrixClientFallback implements FeignHystrixService {
        private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

        /**
         * hystrix fallback方法
         * @param id
         * @return
         */
        @Override
        public User findByIdFeign(Long id) {
            HystrixClientFallback.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
            User user = new User();
            user.setId(-1L);
            user.setUsername("default username");
            user.setAge(0);
            return user;
        }
    }
}
