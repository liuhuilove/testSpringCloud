package com.lh.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TestSpringCloudApplication {

	public static void main(String[] args) {
		System.out.println("test eureka server");
		SpringApplication.run(TestSpringCloudApplication.class, args);
	}

}
