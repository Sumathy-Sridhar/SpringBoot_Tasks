package com.srm.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankMain {

	public static void main(String[] args) {
		 ApplicationContext appContext = new ClassPathXmlApplicationContext("Bank.xml");
		 BankAcc acobj=(BankAcc) appContext.getBean("bacc");
	      int accno=acobj.getAccno();
	        String custname=acobj.getBcust().getCustname();
	        System.out.println("Account Number: "+accno);
	        System.out.println("Customer Name:  "+custname);
	        System.out.println();
	        BankAcc accobj=(BankAcc)appContext.getBean("bacc1");
	        int acno=accobj.getAccno();
	        String name=accobj.getBcust().getCustname();
	        System.out.println("Account Number: "+acno);
	        System.out.println("Customer Name:  "+name);
		 
	        
	}

}
