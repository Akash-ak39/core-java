package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeDAO edao;

	public EmployeeDAO getEdao() {
		return edao;
	}

	public void setEdao(EmployeeDAO edao) {
		this.edao = edao;
	}

	public void saveemployee(Employee emp) {
		getEdao().save(emp);
	}
	
	public List<Employee> checkuser(String userName,String password){
		return getEdao().checkuser(userName, password);
	}
	public List<Employee> checkuid(Employee emp){
		return getEdao().checkuid(emp);
	}
}
