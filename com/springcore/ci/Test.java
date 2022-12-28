package com.springcore.ci;
//constructor injection

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/config.xml");
		
		Person p=(Person) context.getBean("person");
		System.out.println(p);
		
		
		Adition sum=(Adition) context.getBean("add");
		System.out.println(sum);
	}

}
