package com.lh.test.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceFailure implements HelloService {

	@Override
	public String hello() {
		System.out.println("hello world service is not available !");
		return "hello world service is not available !";
	}

}
