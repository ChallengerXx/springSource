package com.test.spring;

import com.test.spring.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("com.test.spring")
public class SpringRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringRunner.class);

		DemoService service = context.getBean(DemoService.class);
		Object bean = context.getBean("environment");
		System.out.println("==========environment===========");
		System.out.println(bean);
		Object bean1 = context.getBean("systemProperties");
		System.out.println("===========systemProperties==========");
		System.out.println(bean1);
		Object bean2 = context.getBean("systemEnvironment");
		System.out.println("==========systemEnvironment===========");
		System.out.println(bean2);
		service.print();
	}
}
