package com.zyt.microserviceconsumermovieribbonwithhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * EnableCircuitBreaker  断路器
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class MicroserviceConsumerMovieRibbonWithHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConsumerMovieRibbonWithHystrixApplication.class, args);
	}

	@Bean
	@LoadBalanced //启用负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
