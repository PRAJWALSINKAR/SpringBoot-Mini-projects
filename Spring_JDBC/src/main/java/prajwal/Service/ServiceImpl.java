package prajwal.Service;

import prajwal.dao.Dao;

public class ServiceImpl implements Service {
    private Dao dao;
    public void setDao(Dao dao) { 
        this.dao = dao;
    }
	public ServiceImpl() {
		System.out.println("service construct created");
	}

	public void save() {
		boolean status  = dao.save();
		if(status) {
			System.out.println("book is insterted");
		}
		else
			System.out.println("not inserted");
	}
}
