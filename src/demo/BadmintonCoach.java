package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BadmintonCoach implements Coach, DisposableBean {

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> BadmintonCoach : inside doMyStartupStuff()");
	}
	
	@Override
	public String getDailyWorkout() {
		return "BadmintonCoach : Practice your backhand smash";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(">> BadmintonCoach : inside destroy()");
		
	}

}
