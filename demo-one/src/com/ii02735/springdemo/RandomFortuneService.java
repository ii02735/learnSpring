package com.ii02735.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private final String[] message = new String[] {"Happy day","Pratice day","Rest day"};
	private final Random r = new Random();
	
	@Override
	public String getFortune() {
		return message[r.nextInt(this.message.length)];
	}

}
