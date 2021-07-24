package com.srm.didemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDimain {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Countrycap.xml");
		 
        Countryclass countryObj = (Countryclass) appContext.getBean("CountryBean");
        String countryName=countryObj.getCountryName();
        String capitalName=countryObj.getCapitalClass().getCapitalName();
        System.out.println("Dependency Injection Via Constructor");
        System.out.println(capitalName+" is capital of "+countryName);
       

	}

}
