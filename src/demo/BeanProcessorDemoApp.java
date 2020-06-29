package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanProcessorDemoApp {

	public static void main(String[] args) {

		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("badmintonCoach", Coach.class);
		@SuppressWarnings("unused")
		Coach alphaCoach = context.getBean("badmintonCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}








