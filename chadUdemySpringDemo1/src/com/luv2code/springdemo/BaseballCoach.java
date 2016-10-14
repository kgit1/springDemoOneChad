package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	private FortuneService fortuneService2;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setFortuneService2(FortuneService fortuneService2) {
		this.fortuneService2 = fortuneService2;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return getClass().getSimpleName() + "\n" 
				+ fortuneService.getFortune() + "\n"
				+ fortuneService2.getFortune();
	}
}
