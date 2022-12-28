package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] str) {
	// TODO Auto-generated method stub
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
	Emp emp=(Emp) context.getBean("collectionsBean");
	System.out.println(emp.getName());
	System.out.println(emp.getAddress());
	System.out.println(emp.getCourses());
	System.out.println(emp.getAuth());
}
}