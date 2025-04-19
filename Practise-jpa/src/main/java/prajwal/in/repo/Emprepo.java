package prajwal.in.repo;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import prajwal.in.employee.Employee;

public interface Emprepo extends JpaRepository<Employee, Integer>{
    @Query("From Employee")
    public Employee getEmployee(Integer id);
    
    Optional<Employee> findByEname(String ename);
    
  //  Page<Employee> findByNameContaining(String name, Pageable pageable);

}
