package com.test.spring.service.impl;

import com.test.spring.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
	@Override
	public void print() {
		System.out.println("demoServiceImpl run....");
	}
}
