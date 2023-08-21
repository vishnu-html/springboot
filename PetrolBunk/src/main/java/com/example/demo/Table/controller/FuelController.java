package com.example.demo.Table.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Table.model.PetrolBunk;
import com.example.demo.Table.service.FuelService;

@RestController
public class FuelController {

	
	@Autowired
	FuelService fser;
	@PostMapping("/saveFuel")
	
	public PetrolBunk saveFuelStationDe(@RequestBody PetrolBunk pb)
	{
		return fser.saveDetails(pb);
	}
	
	@GetMapping("/getFuel")
	public List<PetrolBunk> getFuelStationDe()
	{
		return fser.getDetails();
	}
}