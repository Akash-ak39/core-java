package mycontroller;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bs3")
@SessionAttributes("myobj")
public class BasicController3 {
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String sayhello() {
		return "home";//basic method
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello1")
	public String sayhello1(Model model) {
		model.addAttribute("myobj", "this is from hello1");
		return "home";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello2")
	public String sayhello2(HttpServletRequest request) {
		request.setAttribute("myobj", "this is request added value...");
		return "home";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello3")
	public ModelAndView sayhello3() {
		ModelAndView mandv = new ModelAndView();
		mandv.addObject("myobj", "this is object value..");
		mandv.setViewName("home");
		return mandv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello4")
	public String sayhello4(HttpServletRequest request, Model model) {
		request.setAttribute("myobj", "this is request added value...");
		model.addAttribute("myobj", "this is session value added from hello4");
		return "home";
	}
}
