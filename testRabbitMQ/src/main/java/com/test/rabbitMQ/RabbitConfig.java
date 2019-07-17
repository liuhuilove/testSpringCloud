package com.test.rabbitMQ;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rabbitmq.client.impl.AMQImpl.Queue;


@Configuration
public class RabbitConfig {
	@Bean
	public 	Queue Queue() {
		return new Queue();
	} 

}
