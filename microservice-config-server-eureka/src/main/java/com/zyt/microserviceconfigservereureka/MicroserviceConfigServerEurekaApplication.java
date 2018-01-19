package com.zyt.microserviceconfigservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 将Config Server 与 Eureka等注册中心联合使用
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class MicroserviceConfigServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConfigServerEurekaApplication.class, args);
	}
}
