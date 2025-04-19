package prajwal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import prajwal.Exception.ProductNotFoundException;
import prajwal.product.product;
import prajwal.service.serviceImpl;

@org.springframework.stereotype.Controller
public class Controller {
     
	@Autowired
	private serviceImpl service;
	
	@Value("${custom.message}")
	private String message;

	@GetMapping("/env-message")
	public String getEnvMessage() {
	    return message;
	}

	@GetMapping("/")
	public ModelAndView load() {
		ModelAndView mav  = new ModelAndView(); 
		mav.addObject("obj", new product());
		mav.setViewName("index");
		return mav;
	}
	// Global Exception Handler
		@ExceptionHandler(value = Exception.class)
		public String handleException(Exception ex, Model model) {
			model.addAttribute("errorMsg", "Something went wrong! Please try again.");
			return "error";   // Create error.html for this
		}
		
		
	@GetMapping("/prajwal")
	@ResponseBody
	public String welcome(@RequestParam("nae") String nae){
	  return nae +" , Welcome";
	}
	
	
	@PostMapping("/product")
	public ModelAndView productView(product obj) {
		ModelAndView mav = new ModelAndView();
		
	boolean status = service.saveproduct(obj);
	if(status) {
		mav.addObject("msg", "product saved");
	}else {
		mav.addObject("msg", "product not saved");
	  }
	
	mav.addObject("obj" , new product());
	mav.setViewName("index");
	return mav;
	}
	
	@GetMapping("/products/{pid}")
	public ModelAndView viewproducts(@PathVariable Integer pid) {
		if (pid >= 100) {
			throw new ProductNotFoundException("Invalid Product ID: " + pid);
		}
		List<product> prod = service.getproducts();
		ModelAndView mav = new ModelAndView();
		mav.addObject("plist", prod);
		mav.setViewName("data");
		return mav;
	}
	
}
