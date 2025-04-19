package prajwal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import prajwal.product.product;

public interface productRepo extends  JpaRepository<product , Integer> {
	
}
