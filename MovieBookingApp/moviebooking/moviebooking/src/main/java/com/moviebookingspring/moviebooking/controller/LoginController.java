package com.moviebookingspring.moviebooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.moviebookingspring.moviebooking.entity.User;
import com.moviebookingspring.moviebooking.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {

	@Autowired
	private UserService us;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login()
	{
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String welcome(ModelMap model, @RequestParam String name,@RequestParam String pwd)
	{
		User user=us.getUserByName(name);
		if(user.getPwd().equals(pwd))
		{
			model.put("name",name);
			return "welcome";
		}
		model.put("ermsg","please provide crct user credentials");
		return "login";
	}
	@RequestMapping(value="/signin",method=RequestMethod.GET)
	public String signin()
	{
		return "signin";
	}
	@RequestMapping(value="/signin",method=RequestMethod.POST)
	public String signin(ModelMap model, @RequestParam String name,@RequestParam String pwd)
	{
		User user=new User();
		user.setName(name);
		user.setPwd(pwd);
		us.saveUser(user);
		model.put("name",name);
		return "welcome";
	}
}
