package com.ii02735.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	// Fix temporaire pour Application.java
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		/**
		 * Petite modification pour distinguer l'invocation
		 * du service dans cette classe de Coach par rapport
		 * aux autres classes
		 */
		return "Just Do it "+this.fortuneService.getFortune();
	}

}
