package com.luv2code.springdemo;

import java.util.Random;

// 1. Define a new implementation for the FortuneService.
public class RandomFortuneService implements FortuneService {

	//array of fortunes
	String[] fortunes = {"Your good day", "Your bad day", "Your lucky day", "Don't leave house today"};
	
	//private Random generator
	private Random rand = new Random();
	@Override
	public String getFortune() {
		
		int index = rand.nextInt(fortunes.length);
		String result = fortunes[index];
		
		return result;
	}

}
