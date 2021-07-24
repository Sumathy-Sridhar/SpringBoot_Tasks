package com.srm.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleMain {

	public static void main(String[] args) {
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Lifecycle.xml");

	      Lifecycle lifeobj = (Lifecycle) context.getBean("lf");
	      lifeobj.getMessage();
	      context.registerShutdownHook();

	}

}
