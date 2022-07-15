package com.ii02735.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("tennisCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println("tennisCoach : " + coach.getDailyFortune());
		
		coach = context.getBean("basketCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println("basketCoach : " + coach.getDailyFortune());
		
		coach = context.getBean("cricketCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println("CricketCoach : " + coach.getDailyFortune());
		
		
		context.close();
	}
}
