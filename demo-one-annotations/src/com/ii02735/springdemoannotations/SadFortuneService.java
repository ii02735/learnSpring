package com.ii02735.springdemoannotations;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "this is a sad day";
	}

}
