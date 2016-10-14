package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		FortuneService fs = new HappyFortuneService();
		// create object
		Coach theCoach1 = new BaseballCoach(fs);
		Coach theCoach2 = new TrackCoach(fs);
		// use object
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach1.getDailyFortune());

		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());

	}

}
