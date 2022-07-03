package com.ii02735.springdemo;

public class SpecialBaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public SpecialBaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 2 hours on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
