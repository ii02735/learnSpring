package com.ii02735.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Cas avec le singleton
		Coach coach1 = context.getBean("tennisCoach",Coach.class);
		Coach coach2 = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(coach1 == coach2);
		
		
		
		context.close();
	}
}
