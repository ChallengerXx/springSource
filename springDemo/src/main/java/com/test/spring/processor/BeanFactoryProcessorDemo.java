package com.test.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryProcessorDemo implements BeanFactoryPostProcessor {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("execute BeanFactoryProcessorDemo postProcessBeanFactory method");
	}
}
