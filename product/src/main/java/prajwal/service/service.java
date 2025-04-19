package prajwal.service;

import java.util.List;

import prajwal.product.product;

public interface service {
 
	public boolean saveproduct(product p);
	
	public List<product> getproducts();
}
