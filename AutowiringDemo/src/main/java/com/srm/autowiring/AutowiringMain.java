package com.srm.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("empdesig.xml");
		Employee empobj = (Employee)context.getBean("empbean1");
		System.out.println("Autowiring ByName");
		empobj.setEmpid(1);
		empobj.setEmpname("John");
		System.out.println("\nEmployee Details:"+empobj+empobj.getDesignation());
		Employee emptype=(Employee)context.getBean("empbean2");
		System.out.println("\nAutowiring ByType");
		System.out.println("\nEmployee Details: "+emptype+emptype.getDesignation());
	}

}
