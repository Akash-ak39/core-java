package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	
	@Query("from Employee where uname=?1 and password=?2")
	public List<Employee> checkuser(String userName,String password);
	
	@Query("from Employee order by uid ASC")
	public List<Employee> checkuid(Employee emp);
	
	
	}
	
	
	

