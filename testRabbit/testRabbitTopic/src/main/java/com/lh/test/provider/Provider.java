package com.lh.test.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Provider {
	
	@Autowired
	private AmqpTemplate template;
	@Value("${mq.config.exchange}")
	private String exchange;
	public void send() {
		String msg = "hello direct";
		this.template.convertAndSend(this.exchange,"log.info.routing.key",msg);
	}
}
