package com.test.spring.demoBean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class InitializingDemoBean implements InitializingBean, BeanNameAware {


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("execute afterPropertiesSet method!");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("set BeanName:" + name);
	}
}
