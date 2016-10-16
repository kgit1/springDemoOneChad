package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	private FortuneService fortuneService2;
	private String emailAddress;
	private String team;

	public BaseballCoach(FortuneService fortuneService) {
		System.out.println("BaseballCoach: inside arg-constructor");
		this.fortuneService = fortuneService;
	}

	public void setFortuneService2(FortuneService fortuneService2) {
		this.fortuneService2 = fortuneService2;
	}
	

	//add init method
	public void doMyStartupStuff(){
		System.out.println("BaseballCoach: inside method doMyStartupStuff");
	}
	
	//add destroy method
	public void doMyCleanupStuff(){
		System.out.println("BaseballCoach: inside method doMyCleanupStuff");
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return getClass().getSimpleName() + "\n"
		+ fortuneService.getFortune() 
		+ "\n" + fortuneService2.getFortune();
	}
	
}
