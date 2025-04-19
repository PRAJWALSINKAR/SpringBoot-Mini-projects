package prajwal.Exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	// Custom Exception Handler
	@ExceptionHandler(value = ProductNotFoundException.class)
	public String handleProductNotFound(ProductNotFoundException ex, Model model) {
		model.addAttribute("errorMsg", "Sorry, The Product You Are Looking For Does Not Exist!");
		return "error";   // Create error.html for this
	}

	
}
