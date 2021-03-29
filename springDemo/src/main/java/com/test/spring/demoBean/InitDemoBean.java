package com.test.spring.demoBean;

import org.springframework.stereotype.Component;

@Component
public class InitDemoBean {

	private String name;

	public void initMethod() {
		System.out.println("InitSequenceBean: init-method");
		name = "init-method";
	}
}
