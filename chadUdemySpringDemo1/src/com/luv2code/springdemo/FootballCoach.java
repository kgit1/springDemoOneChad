package com.luv2code.springdemo;

public class FootballCoach implements Coach {
	private FortuneService fortuneService;
	private FortuneService fortuneService2;

	public FootballCoach() {
		System.out.println("FootballCoach: inside non-arg constructor");
	}
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("FootballCoach: inside arg constructor");
	}
	public void setFortuneService2(FortuneService fortuneService2) {
		this.fortuneService2 = fortuneService2;
		System.out.println("FootballCoach: inside setter");
	}

	@Override
	public String getDailyWorkout() {
		return getClass().getSimpleName() +": practice penalty";
	}

	@Override
	public String getDailyFortune() {
		return getClass().getSimpleName() + "\n" + fortuneService.getFortune() + "\n" + fortuneService2.getFortune();
	}

}
