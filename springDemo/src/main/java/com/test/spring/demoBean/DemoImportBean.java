package com.test.spring.demoBean;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Import(ImportedBean.class)
@Component
public class DemoImportBean {

	private String age = "22";
}
