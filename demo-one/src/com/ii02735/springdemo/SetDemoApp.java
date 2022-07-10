package com.ii02735.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetDemoApp {
	
	public static void main(String[] args) {
		// Chargement de la configuration de Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Récupération du bean
		Coach coach = context.getBean("cricketCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}

}
