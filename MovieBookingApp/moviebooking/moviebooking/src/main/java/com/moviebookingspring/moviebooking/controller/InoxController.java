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

import com.moviebookingspring.moviebooking.entity.Inox;
import com.moviebookingspring.moviebooking.service.InoxService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/inox")
public class InoxController {
			
			@Autowired
			private InoxService inxs;
			
			@PostMapping("/addinox")
			public void saveInox(@RequestBody Inox inx)
			{
				inxs.saveInox(inx);
			}
			
			@PostMapping("/addinoxs")
			public void saveInoxs(@RequestBody List<Inox> inx)
			{
				inxs.saveAllInoxs(inx);
			}
			
			@GetMapping("/{id}")
			public Optional<Inox> getInox(@PathVariable long id)
			{
				return inxs.getInox(id);	
			}
			
			@GetMapping("/allinoxs")
			public List<Inox> getAllInoxs()
			{
				return inxs.getAllInoxs();	
			}
			
			@PutMapping("/updateinox")
			public void updateInox(@RequestBody Inox inx)
			{
				 inxs.updateInox(inx);
			}
			@DeleteMapping("/{id}")
			public void deleteInox(@PathVariable long id)
			{
				 inxs.deleteInox(id);
			}
}
