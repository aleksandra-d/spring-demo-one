package com.luv2code.springdemo;

public class YogaCoach implements Coach {
	
	private FortuneService fortuneService;

	public YogaCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public YogaCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Practise yoga everyday for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
	
	// add an init method
	public void doWhileStart() {
		System.out.println("this is start of life of bean");
	}
	
	// add a destroy method
	public void doWhileDying() {
		System.out.println("this is end of life of bean");
	}
 
}
