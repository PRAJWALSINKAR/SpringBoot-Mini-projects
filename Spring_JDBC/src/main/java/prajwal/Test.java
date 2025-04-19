package prajwal;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import prajwal.Service.Service;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	        
	        Service bookService = context.getBean("bookService", Service.class);
	        bookService.save();
	    }
	}


