package com.moviebookingspring.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebookingspring.moviebooking.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	User findById(User usr);
	
	User getUserByName(String name);

}
