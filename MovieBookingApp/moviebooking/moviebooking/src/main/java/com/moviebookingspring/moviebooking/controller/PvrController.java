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

import com.moviebookingspring.moviebooking.entity.PVR;
import com.moviebookingspring.moviebooking.service.PvrService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/pvr")
public class PvrController {

		@Autowired
		private PvrService pvrser;

		@PostMapping("/addpvr")
		public void savePvr(@RequestBody PVR pvr)
		{
			pvrser.savePVR(pvr);
		}
		
		@PostMapping("/addpvrs")
		public void savePvrs(@RequestBody List<PVR> pvr)
		{
			pvrser.saveAllPvrs(pvr);
		}
		
		@GetMapping("/{id}")
		public Optional<PVR> getPvr(@PathVariable long id)
		{
			return pvrser.getPvr(id);	
		}
		
		@GetMapping("/allPvrs")
		public List<PVR> getAllPvrs()
		{
			return pvrser.getAllPvrs();	
		}
		
		@PutMapping("/updatepvr")
		public void updatePvr(@RequestBody PVR pvr)
		{
			 pvrser.updatePvr(pvr);
		}
		@DeleteMapping("/{id}")
		public void deletePvr(@PathVariable long id)
		{
			 pvrser.deletePvr(id);
		}
}
