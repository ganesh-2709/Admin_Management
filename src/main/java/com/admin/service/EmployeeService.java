package com.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.admin.entity.EmployeesData;
import com.admin.repository.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo repo;
	
	
	public EmployeesData insert(EmployeesData data) {
		//EmployeesData d= new EmployeesData();
	
		return repo.save(data);	 
	}
	
	
	
	//get all set of data
	public List<EmployeesData> fetchall() {
		
		return repo.findAll();
	}
	
// get data by using id number
	public Optional<EmployeesData> getempbyid(int empId) {
		// TODO Auto-generated method stub
		Optional<EmployeesData> byid = repo.findById(empId);
		return byid;
	}
	
	
	

// update data  	
	public EmployeesData update(EmployeesData data,Model model) {
			
			
			return repo.save(data); 
       
        
		
			}
	// delete by using empid
	public String delete(int empid) {
		
		 repo.deleteById(empid);
		 return "data deleted from database";
	}



	public String deleteall() {
		
		 repo.deleteAll();
		 return "All data delete from DataBase";
	}



	
		
	
}
