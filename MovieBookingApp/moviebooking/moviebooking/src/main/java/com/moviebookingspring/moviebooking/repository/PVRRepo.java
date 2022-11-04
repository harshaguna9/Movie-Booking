package com.moviebookingspring.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebookingspring.moviebooking.entity.PVR;

@Repository
public interface PVRRepo extends JpaRepository<PVR,Long> {

}
