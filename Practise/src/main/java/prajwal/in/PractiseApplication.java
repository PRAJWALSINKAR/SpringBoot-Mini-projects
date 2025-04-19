package prajwal.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import prajwal.in.robot.Robot;

@SpringBootApplication
public class PractiseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PractiseApplication.class, args);
		
		Robot robo = context.getBean(Robot.class);		
		robo.runn();
	}

}
