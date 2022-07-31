package com.ii02735.springdemoannotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
    
	private final String[] messages = new String[] { "this'll be a good day", "beware of this day", "there won't be any training today" };
	private Random r = new Random();
	
	
	@Override
	public String getFortune() {
		return this.messages[r.nextInt(this.messages.length)];
	}
}
