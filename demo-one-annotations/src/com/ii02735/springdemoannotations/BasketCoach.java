package com.ii02735.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Throw the ball into the basket";
	}

}
