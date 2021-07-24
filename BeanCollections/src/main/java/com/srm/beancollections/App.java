package com.srm.beancollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beancoll.xml");

		Customer cust = (Customer) context.getBean("CustomerBean");
		cust.getLists();
		System.out.println(cust);
			
	}
}