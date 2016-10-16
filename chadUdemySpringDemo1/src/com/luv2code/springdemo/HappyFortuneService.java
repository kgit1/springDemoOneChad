package com.luv2code.springdemo;

import java.util.ArrayList;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		int index=(int)(Math.random()*3);
		ArrayList<String> fortunes = new ArrayList<>();
		fortunes.add("1 Today is your lucky day!");
		fortunes.add("2 Today is your lucky day!");
		fortunes.add("3 Today is your lucky day!");
		
		return fortunes.get(index);
	}

}
