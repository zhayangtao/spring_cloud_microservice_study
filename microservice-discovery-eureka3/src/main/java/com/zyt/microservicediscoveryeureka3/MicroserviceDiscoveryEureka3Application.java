package com.zyt.microservicediscoveryeureka3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEureka3Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryEureka3Application.class, args);
	}
}
