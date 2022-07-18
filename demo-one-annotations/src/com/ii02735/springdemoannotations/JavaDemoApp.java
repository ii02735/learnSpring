package com.ii02735.springdemoannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;	

public class JavaDemoApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportContainerConfig.class);
		
		Coach coach1 = context.getBean("tennisCoach",Coach.class);
		Coach coach2 = context.getBean("tennisCoach",Coach.class);
		System.out.println(coach1 == coach2);
		
		context.close();
	}
}
