package prajwal.in.service;

import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import prajwal.in.employee.Employee;
import prajwal.in.repo.Emprepo;


@org.springframework.stereotype.Service
public class Service {
	
    private  Emprepo Repo;
    
    public Service(Emprepo Repo) {
    	this.Repo = Repo;
    }
    public void FindyById(int id) {
		Iterable<Employee> emps = Repo.findAll();
		emps.forEach(System.out::println);
	}
//    public void saveEmps() {
//    	Employee e1 = new Employee(105, "dog", 20.22);
//    	Employee e2 = new Employee(106, "cat", 100.22);
//    	Employee e3 = new Employee(107, "mouse", 1205.22);
//    	  
//    	List<Employee> emps = Arrays.asList(e1 , e2 , e3);
//    	Repo.saveAll(emps);
//    	System.out.println("Record saved");
//    }
    
    
    public void getEmployee(int id) {
    	Optional<Employee> find = Repo.findById(id);//to prevent ullPointer Exception
    	if (find.isPresent()) {
			Employee employee = find.get();
			System.out.println(employee);
		} else {
			System.out.println("Record Not Found");
		}
    }
    public void updateEmployee(int id, String newName, Double newSalary) {
        Optional<Employee> optionalEmployee = Repo.findById(id);

        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            employee.setName(newName);
            employee.setSalary(newSalary);
            
            Repo.save(employee); // This will update the record since ID exists
            System.out.println("Record updated: " + employee);
        } else {
            System.out.println("Employee with ID " + id + " not found!");
        }
    }
    // find out by name -  and update the salary 
    public void updateEmployeeByName(String name, Double newSalary) {
        Optional<Employee> optionalEmployee = Repo.findByEname(name);

        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            employee.setSalary(newSalary); // Update salary
            
            Repo.save(employee); // Save the updated record
            System.out.println("Record updated: " + employee);
        } else {
            System.out.println("Employee with name '" + name + "' not found!");
        }
    }
    public void getPagination() {
        int Size = 2;   // Number of records per page
        int Number = 0; // Page number (starting from 0)

        Pageable pageable = PageRequest.of(Number, Size);
        
        Page<Employee> page = Repo.findAll(pageable); // ✅ Use `Repo`, not `Emprepo`

        List<Employee> emps = page.getContent();

        emps.forEach(e -> System.out.println(e)); // ✅ Fix missing parenthesis
    }
    // save method
    public void saveEmployee() {
    	Employee e = new Employee("prajwal" , 500.00); 
//    	e.setName("raju");
//    	e.setSalary(4000.00);
//    	
    	Repo.save(e);
    	System.out.println("recored saved");
    	
    }
}
