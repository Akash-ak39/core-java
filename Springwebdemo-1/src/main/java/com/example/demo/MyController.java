package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/myc")
public class MyController {
	
	@Autowired
	private StudentService service;
	
	
	public StudentService getService() {
		return service;
	}
	public void setService(StudentService service) {
		this.service = service;
	}
	@RequestMapping(method=RequestMethod.GET, value = "/create")
	public void create() {
		System.out.println("saving student object...");
		Student student=new Student();
		student.setSid(100);
		student.setSname("harigiri");
		student.setScity("chennai");
		student.setSage(20);
		
		service.saveStudent(student);
		System.out.println("student object saved...........");
	}
}