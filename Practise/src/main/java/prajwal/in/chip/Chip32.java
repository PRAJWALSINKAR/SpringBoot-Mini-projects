package prajwal.in.chip;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip32")

public class Chip32 implements Ichip{
    public Chip32() {
    	System.out.println("Chip 32 construct");
    }
    
    public boolean process() {
    System.out.println("chip 32 is running");
    return true;
    
    }
}
