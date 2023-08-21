package com.example.demo.Table.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Table.model.PetrolBunk;
import com.example.demo.Table.repository.fuelRepository;

@Service
public class FuelService {
	@Autowired
	fuelRepository frepo;
	
	public PetrolBunk saveDetails(PetrolBunk p)
	{
		return frepo.save(p);
	}
	
	public List<PetrolBunk> getDetails()
	{
		return frepo.findAll();
	}
}
