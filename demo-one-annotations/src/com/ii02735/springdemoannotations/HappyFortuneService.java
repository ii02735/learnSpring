package com.ii02735.springdemoannotations;

import org.springframework.stereotype.Service;

@Service
public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		return "Today is your lucky day !";
	}
}
