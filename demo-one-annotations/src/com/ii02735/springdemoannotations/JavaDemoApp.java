package com.ii02735.springdemoannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;	

public class JavaDemoApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportContainerConfig.class);
		
		SwimCoach coach1 = context.getBean("swimCoach",SwimCoach.class); // utilisation d'une classe concrète pour invoquer l'accesseur
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getTeamIdentifier());
		
		context.close();
	}
}
