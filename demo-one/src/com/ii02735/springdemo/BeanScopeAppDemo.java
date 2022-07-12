package com.ii02735.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeAppDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// Par défaut, le scope est en singleton
		Coach coach1 = context.getBean("coach",Coach.class);
		Coach coach2 = context.getBean("coach",Coach.class);
		
		// Vérifier si les deux instances sont identiques
		System.out.println("Pointing to the same object -> " + (coach1 == coach2));

		Coach coach3 = context.getBean("differentCoach",Coach.class);
		Coach coach4 = context.getBean("differentCoach",Coach.class);
		
		System.out.println("Pointing to the same object -> " + (coach3 == coach4));
		
		context.close();
	}

}
