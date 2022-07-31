package com.ii02735.springdemoannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// Injection de l'instance de FortuneService dans le constructeur
	/**
	 * Pour le moment, Spring injectera le type HappyFortuneService, car
	 * c'est la première classe qu'il a rencontré dans son analyse
	 */
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@PostConstruct
	private void initializeTennisCoach()
	{
		System.out.println("Tennis coach has been initialized");
	}
	
	@PreDestroy
	private void destroyTennisCoach()
	{
		System.out.println("Tennis coach has been destroyed");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Doing some spares";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
