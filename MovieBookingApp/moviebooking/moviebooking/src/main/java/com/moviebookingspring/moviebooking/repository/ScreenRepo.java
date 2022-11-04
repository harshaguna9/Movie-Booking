package com.moviebookingspring.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebookingspring.moviebooking.entity.Screen;

@Repository
public interface ScreenRepo extends JpaRepository<Screen ,Long> {

}
