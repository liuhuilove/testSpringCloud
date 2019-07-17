package com.lh.test.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="SERVICE-HELLOWORLD/hello",fallback=HelloServiceFailure.class)
public interface HelloService {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	String hello();
}
