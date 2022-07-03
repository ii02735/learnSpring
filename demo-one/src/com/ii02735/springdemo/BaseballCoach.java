package com.ii02735.springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on batting practice";
	}
}
