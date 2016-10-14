package com.luv2code.springdemo;

public class HockeyCoach implements Coach {
	private FortuneService fortuneService;
	private FortuneService fortuneService2;

	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setFortuneService2(FortuneService fortuneService2) {
		this.fortuneService2 = fortuneService2;
	}

	@Override
	public String getDailyWorkout() {
		return "Hockey coach";
	}

	@Override
	public String getDailyFortune() {
		return getClass().getSimpleName() + "\n" + fortuneService.getFortune() + "\n" + fortuneService2.getFortune();
	}

}
