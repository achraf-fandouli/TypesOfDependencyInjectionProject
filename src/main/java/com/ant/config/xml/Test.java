package com.ant.config.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// Chargement de context
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		B b = (B) context.getBean("b1");
		b.m();

	}

}
