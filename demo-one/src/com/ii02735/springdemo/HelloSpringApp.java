package com.ii02735.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		
		// Chargement du fichier de configuration de spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Récupération du bean depuis le container
		Coach coach = context.getBean("baseballCoach", Coach.class);
		// Appeler les méthodes du bean
		System.out.println(coach.getDailyWorkout());
		// Invocation de la méthode qui appelle notre dépendance
		System.out.println(coach.getDailyFortune());
		// Fermer le contexte d'application
		context.close();
	}
	
}
