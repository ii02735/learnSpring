package com.ii02735.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleBeanAppDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		// Invocation de la méthode d'initialisation de la bean (myStartupStuff)
		Coach coach1 = context.getBean("coach",Coach.class);
		
		System.out.println(coach1.getDailyWorkout());
		// Invocation de la méthode de destruction de la bean (myCleanupStuff)
		context.close();
	}

}
