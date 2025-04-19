package praj.in.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import praj.in.binding.Customer;
@RestController
public class CustmorRestController {
	       @GetMapping(
			value = "/customers", 
			produces = "application/json"
	         )
	public ResponseEntity<List<Customer>> getCustomers() {
		Customer c1 = new Customer(1, "John", "john@gmail.com");
		Customer c2 = new Customer(2, "Smith", "smith@gmail.com");
		Customer c3 = new Customer(3, "David", "david@gmail.com");
		List<Customer> list = Arrays.asList(c1, c2, c3);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping(
			value = "/customer", 
			produces = "application/json"
	)
	public ResponseEntity<Customer> getCustomer() {
		Customer c = new Customer(1, "John", "john@gmail.com");
		return new ResponseEntity<>(c, HttpStatus.OK);
}
}