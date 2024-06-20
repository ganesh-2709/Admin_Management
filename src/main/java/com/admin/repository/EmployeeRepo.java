package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.entity.EmployeesData;
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeesData, Integer> {
	
							
}
