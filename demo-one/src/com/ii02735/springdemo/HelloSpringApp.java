package com.ii02735.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		
		// Chargement du fichier de configuration de spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Récupération du bean depuis le container
		Coach coach = context.getBean("coach", Coach.class);
		// Appeler les méthodes du bean
		System.out.println(coach.getDailyWorkout());
		// Invocation de la méthode qui appelle notre dépendance
		System.out.println(coach.getDailyFortune());
		// Fermer le contexte d'application
		
		/** 
		 * Test de l'injection de valeurs littérales :
		 * Comme il n'y a que CricketCoach qui possèdent les attributs
		 * email, et team, nous devons requêter une bean avec un TYPE EXPLICITE
		 */
		
		CricketCoach cricketCoach = context.getBean("cricketCoach",CricketCoach.class);
		System.out.println(cricketCoach.getEmail());
		System.out.println(cricketCoach.getTeam());
		
		// Test pour une autre bean, avec le même type
		
		CricketCoach headCricketCoach = context.getBean("headCricketCoach",CricketCoach.class);
		System.out.println(headCricketCoach.getEmail());
		System.out.println(headCricketCoach.getTeam());
		
		// Test avec notre bean qui lit notre fichier de propriétés
		CricketCoach customCricketCoach = context.getBean("customCricketCoach",CricketCoach.class);
		System.out.println(customCricketCoach.getEmail());
		System.out.println(customCricketCoach.getTeam());
		context.close();
	}
	
}
