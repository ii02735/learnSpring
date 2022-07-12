package com.ii02735.springdemoannotations;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Doing some spares";
	}

}
