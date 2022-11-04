package com.moviebookingspring.moviebooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviebookingspring.moviebooking.entity.User;
import com.moviebookingspring.moviebooking.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/adduser")
	public void saveUser(@RequestBody User usr)
	{
		userservice.saveUser(usr);
	}
	
	@PostMapping("/addusers")
	public void saveUsers(@RequestBody List<User> usr)
	{
		userservice.saveUsers(usr);
	}
	
	@GetMapping("/{id}")
	public Optional<User> getUser(@PathVariable long id)
	{
		return userservice.getUser(id);
	}
	
	@GetMapping("/allusers")
	public List<User> getUsers()
	{
		return userservice.getUsers();
	}
	
	@PutMapping("/updateuser")
	public void updateUser(@RequestBody User usr)
	{
		 userservice.updateUser(usr);
	}
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable long id)
	{
		 userservice.deleteUser(id);
	}
}
