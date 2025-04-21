package prajwal.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
        public static void main(String[] args) {
			
		
       
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Car bean = context.getBean(Car.class);
	bean.drive();
        }

}
