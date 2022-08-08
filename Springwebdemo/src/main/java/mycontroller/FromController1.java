package mycontroller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form1")
public class FromController1 {
	@Autowired
	MessageSource messagesource;
	@RequestMapping(method = RequestMethod.GET, value = "/register")
	public ModelAndView loadform() {
		ModelAndView mandv = new ModelAndView();
		mandv.addObject("userObj", new User());
		mandv.setViewName("userform");
		return mandv;// basic method
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public ModelAndView processform(@Valid @ModelAttribute("userObj") User user,BindingResult result) {
		ModelAndView mandv = new ModelAndView();
		if(result.hasErrors()) {
			mandv.setViewName("userform");
//			FieldError customError=new FieldError("userObj", "uname",messagesource.getMessage("mymessage", null, new Locale("ta")));
//			result.addError(customError);
			return mandv;
		}else {
		System.out.println("Username..:" + user.getUname());
		System.out.println("Password..:" + user.getUpass());
		System.out.println("Email..:" + user.getEmail());
		System.out.println("Phone..:" + user.getPhone());
		user.setUname(user.getUname() + " aspirin rider ");
		mandv.addObject("myuser", user);
		mandv.setViewName("welcome");
		return mandv;
		}
	}

}
