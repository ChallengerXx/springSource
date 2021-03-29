package com.test.spring.processor;

import com.test.spring.config.DemoConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class DemoInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Autowired
	private DemoConfig demoConfig;

	/**
	 * 在目标bean实例化</i>之前应用这个BeanPostProcessor <i>。返回的bean对象可以是替代目标bean使用的代理，
	 * 从而有效地抑制目标bean的默认实例化。
	 * @param beanClass the class of the bean to be instantiated
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("execute postProcessBeforeInstantiation");
		return null;
	}

	/**
	 * 通过构造函数或工厂方法，在实例化bean之后执行操作，但是在Spring属性填充(从显式属性或自动装配)发生之前执行操作。
	 * <p>这是在Spring自动装配开始之前，在给定bean实例上执行定制字段注入的理想回调。
	 * @param bean the bean instance created, with properties not having been set yet
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("execute postProcessAfterInstantiation");
		return true;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("execute postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("execute postProcessAfterInitialization");
		return bean;
	}
}
