package com.ii02735.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// Utilisation de l'injection par méthode (plutôt que par mutateur)
	@Autowired
	@Qualifier("randomFortuneService")
	private void initializeFortuneService(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Strike the ball !";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
