package com.test.spring.circularBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Service1 {

	@Autowired
	Service2 service2;

	@Value("test")
	private String testProperties;
}
