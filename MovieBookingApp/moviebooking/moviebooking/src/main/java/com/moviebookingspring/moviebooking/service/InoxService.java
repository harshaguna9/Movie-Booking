package com.moviebookingspring.moviebooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebookingspring.moviebooking.entity.Inox;
import com.moviebookingspring.moviebooking.repository.InoxRepo;

@Transactional
@Service
public class InoxService {
	
	@Autowired
	private InoxRepo inxr;

	public void saveInox(Inox inx)
	{
		 inxr.save(inx);
	}
	
	public void saveAllInoxs(List<Inox> inx)
	{
		 inxr.saveAll(inx);
	}
	
	public List<Inox> getAllInoxs()
	{
		 return inxr.findAll();
	}
	
	public Optional<Inox> getInox(long id)
	{
		 return inxr.findById(id);
	}
	
	public void deleteInox(long id)
	{
		inxr.deleteById(id);
	}
	
	public void updateInox(Inox inx)
	{
		inxr.save(inx);
	}
}
