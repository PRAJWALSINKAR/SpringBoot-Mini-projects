package prajwal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prajwal.product.product;
import prajwal.repo.productRepo;
@Service
public class serviceImpl implements service {
    @Autowired
	private productRepo repo;
	 
	
	public boolean saveproduct(product p) {
		product pro  = repo.save(p);
		if(pro != null) {
			return true;
		}
		return false;
	}
	
	public List<product> getproducts(){
		
		return repo.findAll();
    }
}