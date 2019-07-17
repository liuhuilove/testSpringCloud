package com.lh.test.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class DemoFilter extends ZuulFilter{
	
	private static Logger log = LoggerFactory.getLogger(DemoFilter.class);
	
	@Override
	public Object run() throws ZuulException {
		
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request =ctx.getRequest();
		String s = String.format("%s >>> %s", request.getMethod(),request.getRequestURI());
		log.info(s);
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}
	/**
	 * 	pre：路由之前
		routing：路由之时
		post： 路由之后
		error：发送错误调用
	 */
	@Override
	public String filterType() {
		return "pre";
	}

}
