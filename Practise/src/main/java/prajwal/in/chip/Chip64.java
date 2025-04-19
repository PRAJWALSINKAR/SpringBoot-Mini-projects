package prajwal.in.chip;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip64")
public class Chip64 implements Ichip {
   
	public Chip64() {
		System.out.println("chip 64 constructor");
	}

	@Override
	public boolean process() {
		System.out.println("chip 64 is Running");	
		return true;
	}

}
