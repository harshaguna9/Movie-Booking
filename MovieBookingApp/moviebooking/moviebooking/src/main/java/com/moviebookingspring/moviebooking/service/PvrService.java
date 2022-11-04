package com.moviebookingspring.moviebooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebookingspring.moviebooking.entity.PVR;
import com.moviebookingspring.moviebooking.repository.PVRRepo;

@Transactional
@Service
public class PvrService {

	@Autowired
	private PVRRepo pvrrepo;

	public void savePVR(PVR pvr)
	{
		 pvrrepo.save(pvr);
	}
	
	public void saveAllPvrs(List<PVR> pvr)
	{
		 pvrrepo.saveAll(pvr);
	}
	
	public List<PVR> getAllPvrs()
	{
		 return pvrrepo.findAll();
	}
	
	public Optional<PVR> getPvr(long id)
	{
		 return pvrrepo.findById(id);
	}
	
	public void deletePvr(long id)
	{
		pvrrepo.deleteById(id);
	}
	
	public void updatePvr(PVR pvr)
	{
		pvrrepo.save(pvr);
	}
}
