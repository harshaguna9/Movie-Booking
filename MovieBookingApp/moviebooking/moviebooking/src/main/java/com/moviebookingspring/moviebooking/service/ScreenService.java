package com.moviebookingspring.moviebooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebookingspring.moviebooking.entity.Screen;
import com.moviebookingspring.moviebooking.repository.ScreenRepo;

@Transactional
@Service
public class ScreenService {
	
	@Autowired
	private ScreenRepo screenrepo;

	public void saveScreen(Screen scrn)
	{
		 screenrepo.save(scrn);
	}
	
	public void saveAllScreens(List<Screen> scrn)
	{
		 screenrepo.saveAll(scrn);
	}
	
	public List<Screen> getAllScreens()
	{
		 return screenrepo.findAll();
	}
	
	public Optional<Screen> getScreen(long id)
	{
		 return screenrepo.findById(id);
	}
	
	public void deleteScreen(long id)
	{
		screenrepo.deleteById(id);
	}
	
	public void updateScreen(Screen scrn)
	{
		screenrepo.save(scrn);
	}
}
