package com.lh.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lh.test.provider.Provider;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRabbitDirectApplicationTests {
	
	@Autowired
	private Provider provider;
	
	@Test
	public void contextLoads() {
		this.provider.send();
	}

}
