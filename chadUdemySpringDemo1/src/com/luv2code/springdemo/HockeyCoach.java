package com.luv2code.springdemo;

public class HockeyCoach implements Coach {
	private FortuneService fortuneService;
	private FortuneService fortuneService2;
	private String emailAddress;
	private String team;

	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setFortuneService2(FortuneService fortuneService2) {
		this.fortuneService2 = fortuneService2;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
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
