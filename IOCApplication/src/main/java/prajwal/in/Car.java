package prajwal.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
   private  IEngine iengine;
	public Car() {
	     System.out.println("Service defalut construct");
	}
	
	public Car(IEngine iengine) {
		this.iengine = iengine;
	}
	public void setiengine(IEngine iengine) {
		this.iengine = iengine;
	}
	public void drive() {
		boolean status = iengine.start();
		
		if(status) {
			System.out.println("car start");
		}else {
			System.out.println("not start");
		}
	}

}
