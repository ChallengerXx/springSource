package com.test.spring.applicationListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoApplicationListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("execute DemoApplicationListener");
	}
}
