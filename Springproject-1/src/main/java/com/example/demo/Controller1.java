package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/con")
public class Controller1 {
	@Autowired
	private EmployeeService service;

	public EmployeeService getService() {
		return service;
	}

	public void setService(EmployeeService service) {
		this.service = service;
	}

//	@RequestMapping(method = RequestMethod.GET,value="/create")
//	public void create() {
//		System.out.println("Saving Employee Object");
//		Employee emp=new Employee();
//		emp.setUserName("Akash");
//		emp.setUserId(03);
//		emp.setCity("chennai");
//		emp.setAddress("Shenoy Nagar");
//		emp.setPhone("6835649586");
//		emp.setPassword("ValentinoRossi");
//		emp.setEmail("akashdoc@gmail.com");
//		emp.setFlag(1);
//		
//		service.saveemployee(emp);
//		System.out.println("Employee valuess Inserted");
//		
//		s
//	}
	@RequestMapping(method = RequestMethod.GET, value = "/first")
	public ModelAndView loadForm() {
		ModelAndView mv = new ModelAndView();
		Employee em=new Employee();
		em.setFlag(0);
		mv.addObject("userobj", new Employee());
		System.out.println("fadhfiau");
		mv.setViewName("register");
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/first")
	public ModelAndView processForm(@ModelAttribute Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("userobj1", emp);
		System.out.println("akaesh");
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/green3")
	public ModelAndView reg1(@ModelAttribute("user") Employee emp,HttpServletRequest request) {
		ModelAndView op = new ModelAndView();
		String pass1=request.getParameter("password");
		String pass2=request.getParameter("password2");
		if(pass1.equals(pass2)) {
			List<Employee> ela=service.checkuid(emp);
			Iterator<Employee>it=ela.iterator();
			int f=0; 
			while(it.hasNext()) {
				f=it.next().getKid();
			}
			int g=f+1;
			emp.setPassword(pass2);
			emp.setUid(g);
			op.addObject("user", emp);
			service.saveemployee(emp);
			
			op.setViewName("welcome");
			return op;
		}
		op.setViewName("error");
		return op;
	}
}


