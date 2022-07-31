package com.ii02735.springdemoannotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	/**
	 * Depuis Spring 4.3, l'ajout de @Autowired
	 * est devenu facultatif dans le cadre d'injection
	 * par constructeur
	 */
	public BasketCoach(@Qualifier("happyFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Throw the ball into the basket";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
