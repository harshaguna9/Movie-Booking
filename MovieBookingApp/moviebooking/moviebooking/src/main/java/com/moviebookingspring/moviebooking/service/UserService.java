package com.moviebookingspring.moviebooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebookingspring.moviebooking.entity.User;
import com.moviebookingspring.moviebooking.repository.UserRepo;

@Transactional
@Service
public class UserService {

	@Autowired
	private UserRepo usrrepo;
	
	public User saveUser(User usr)
	{
		return usrrepo.save(usr);
	}
	
	public List<User> saveUsers(List<User> usr)
	{
		return  usrrepo.saveAll(usr);
	}
	
	public List<User> getUsers()
	{
		return  usrrepo.findAll();
	}
	
	public Optional<User> getUser(long id)
	{
		return  usrrepo.findById(id);
	}
	
	public void deleteUser(long id)
	{
		usrrepo.deleteById(id);
	}
	
	public void updateUser(User usr)
	{
		usrrepo.save(usr);
	}

	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return usrrepo.getUserByName(name);
	}
}
