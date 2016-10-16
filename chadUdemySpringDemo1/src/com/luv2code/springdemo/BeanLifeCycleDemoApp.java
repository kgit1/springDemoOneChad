package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-"
						+ "applicationContext.xml");
		//When you are defining init and destroy methods should follow
		//these rules

		//The methods should be public void
		//The methods should be no-arg, meaning they shouldn't accept
		//any method arguments.
		
		//For "prototype" scoped beans, Spring does not call the destroy method.
		
		//retrive bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//demonstration of create-init-destroy cycle
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(alphaCoach.getDailyWorkout());
		
		//check if they are the same
		boolean result =(theCoach == alphaCoach);
		System.out.println(result);
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		
		context.close();
	}

}
