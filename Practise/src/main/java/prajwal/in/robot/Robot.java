package prajwal.in.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import prajwal.in.chip.Ichip;
@Component
public class Robot {

    private Ichip ichip; 
    
   /* // constructor injection
    public Robot(Ichip ichip) {
    	this.ichip = ichip;
    }
    */
    //setter injection
    @Autowired
    
    public void setIchip(@Qualifier("chip32") Ichip ichip){

    	this.ichip = ichip;
    }
    
     public void runn() {
    	boolean status  = ichip.process();
    	if(status) {
    		System.out.println("Robot is Running");
    	}else
    		System.out.println("robot is not Running");
    }
	
}
