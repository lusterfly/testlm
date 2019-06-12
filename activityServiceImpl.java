package com.wisely.ch11_1;

import org.springframework.beans.BeansException;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


@ConfigurationProperties(prefix = "endpoints.status", ignoreUnknownFields = false) //1
public class StatusEndPoint extends AbstractEndpoint<String> implements ApplicationContextAware{//2
	
	ApplicationContext context;

	public StatusEndPoint() {
		super("status");
	}
    add func1
	@Override
	public String invoke() { //3  返回我们要监控的内容
		StatusService statusService = context.getBean(StatusService.class);
		
		return "The Current Status  is :"+statusService.getStatus();
	}
   add func2
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
		
	}
	    add func11
	@Override
	public String invoke() { //3  返回我们要监控的内容
		StatusService statusService = context.getBean(StatusService.class);
		
		return "The Current Status  is :"+statusService.getStatus();
	}
   add func22
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
		
	}
	    add func13
	@Override
	public String invoke() { //3  返回我们要监控的内容
		StatusService statusService = context.getBean(StatusService.class);
		
		return "The Current Status  is :"+statusService.getStatus();
	}
   add func23
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
		
	}
	    add func14
	@Override
	public String invoke() { //3  返回我们要监控的内容
		StatusService statusService = context.getBean(StatusService.class);
		
		return "The Current Status  is :"+statusService.getStatus();
	}
   add func24
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
		
	}


}
