package praj.in.demo;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
	@GetMapping(value = "/msg" , produces = "text/plain")
	public ResponseEntity<String> getMsg(){
		String msg = "Welcome prajwal";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	
	@GetMapping("/greet/{name}")
	public String getmsg(@PathVariable("name") String name) {
		String msg = name + " , good morning "; 
		return msg;
	}
	
	
	@GetMapping("/prajwal")
	public String getWelcome(@RequestParam("name") String name ) {
		String msg = name + " , Welcome to Rest Api";
		return msg;
	}
	
	
}
