package com.srm.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Employee.xml");
		Employee em=(Employee)context.getBean("emp");
		System.out.println(em);
		
		Employee em1=(Employee)context.getBean("emp1");
		System.out.println(em1);

	}

}
