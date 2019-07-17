package com.lh.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class TestEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestEurekaClientApplication.class, args);
	}
	
	@Value("${server.port}")
	String port;
	
	@RequestMapping("/")
	public String hello() {
		  return "hello world from port " + port;
	}
}
