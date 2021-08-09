package com.srm.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srm.autowiring.DemoManager;
import com.srm.autowiring.ApplicationConfiguration;

public class VerifySpringCoreFeature {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		DemoManager obj = (DemoManager) context.getBean("demoService");
		System.out.println(obj.getServiceName());
	}
}
