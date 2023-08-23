package com.example.demo.Table.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

import com.example.demo.Table.model.GlamMartModel;
import com.example.demo.Table.repository.GlamMartRepository;

@Service

public class GlamMartService {
	@Autowired
	public GlamMartRepository grepo;

	//post the data
	public String saveMatrix(GlamMartModel m)
	{
		 grepo.save(m);
		 return "Data is saved";
		
	}

	//get the data
	public List<GlamMartModel> getMatrix()
	{
		 return grepo.findAll();
			
	}
	// update the data
	public GlamMartModel updatematrix (GlamMartModel mm)
	{
		return grepo.saveAndFlush(mm);
	}
	//delete the data
	public void deletematrix(int products) {
		grepo.deleteById(products);
	}
	//delete data
	public boolean deletematrixif(int products)
	{
		if(grepo.existsById(products)) {
			grepo.deleteById(products);
			return true;
		}else {
			return false;
		}
	}
	//getUserId
	@GetMapping("/users/userId")

	public Optional<GlamMartModel> getuserById(int userId)
	{
		Optional<GlamMartModel> product = grepo.findById(userId);
		if(product.isPresent()) {
			return product;
		}
		else
		{
			return null;
		}
	}
	

}
