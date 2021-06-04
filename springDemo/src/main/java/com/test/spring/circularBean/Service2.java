package com.test.spring.circularBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service2 {

	@Autowired
	Service1 service1;
}
