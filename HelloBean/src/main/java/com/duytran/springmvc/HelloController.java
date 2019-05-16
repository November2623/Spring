package com.duytran.springmvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.duytran.model.Person;
import com.duytran.model.User;

@Controller
public class HelloController {
//	@Autowired
//	@Qualifier("person2")
//	private Person person;
//	
//	@RequestMapping("/hello")
//	public String sayHello(ModelMap map) {
//		map.addAttribute("person", person);
//		return "hello";
//	}
	
	@RequestMapping("/reqParam")
	public ModelAndView sayHello1(HttpServletRequest req, HttpServletResponse res, HttpSession session,
			@RequestParam(name="user", required=true) String username) {
		req.setAttribute("msg", username);
		return new ModelAndView("hello1");
	}
	
	@RequestMapping("/hello/{name}")
	public String hello(HttpServletRequest req, 
			@PathVariable(name ="name")String name) {
		req.setAttribute("msg", name);
		return "hello1";
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.GET)
	public String addUser(HttpServletRequest req) {
		User user = new User();
//		user.setName("Ngan");
		req.setAttribute("user", user);
		return "form";
	}
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public String addUser(HttpServletRequest req, @ModelAttribute("user") @Valid User user, 
			BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			req.setAttribute("error", "error");
			return "form";
		}
		req.setAttribute("user", user);
		return "hello1";
	}
}
