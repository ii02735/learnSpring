package com.ii02735.springdemo;

public class Application {

	public static void main(String[] args) {
		// Utilisation d'une interface
		Coach coach = new TrackCoach();
		// L'appel de la méthode ne dépend plus d'une classe mais d'une abstraction
		System.out.println(coach.getDailyWorkout());
	}

}
