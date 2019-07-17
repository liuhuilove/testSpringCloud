package com.lh.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class TestConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestConfigClientApplication.class, args);
	}
	
	@Value("${hello}")
	private String hello;
	
	@RequestMapping("/hello")
	public String hello() {
		return hello;
		
	}
}
