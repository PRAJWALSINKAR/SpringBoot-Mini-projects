package prajwal.Exception;

public class ProductNotFoundException extends RuntimeException{
 
	  public ProductNotFoundException() {
		  
	  }
	  public ProductNotFoundException(String msg) {
		  super(msg);
	  }
}
