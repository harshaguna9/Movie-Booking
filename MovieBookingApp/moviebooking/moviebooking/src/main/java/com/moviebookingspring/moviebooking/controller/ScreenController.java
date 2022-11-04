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

import com.moviebookingspring.moviebooking.entity.Screen;
import com.moviebookingspring.moviebooking.service.ScreenService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/screen")
public class ScreenController {

	@Autowired
	private ScreenService screenservice;

	@PostMapping("/addscrn")
	public void saveScreen(@RequestBody Screen scrn)
	{
		screenservice.saveScreen(scrn);
	}
	
	@PostMapping("/addscrns")
	public void saveScreens(@RequestBody List<Screen> scrn)
	{
		screenservice.saveAllScreens(scrn);
	}
	
	@GetMapping("/{id}")
	public Optional<Screen> getScreen(@PathVariable long id)
	{
		return screenservice.getScreen(id);	
	}
	
	@GetMapping("/allscrns")
	public List<Screen> getAllScreens()
	{
		return screenservice.getAllScreens();	
	}
	
	@PutMapping("/updatescrn")
	public void updateScreen(@RequestBody Screen scrn)
	{
		 screenservice.updateScreen(scrn);
	}
	@DeleteMapping("/{id}")
	public void deleteScreen(@PathVariable long id)
	{
		 screenservice.deleteScreen(id);
	}
}
