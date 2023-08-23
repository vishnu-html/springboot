package com.example.demo.Table.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Table.model.GlamMartModel;
import com.example.demo.Table.service.GlamMartService;

@RestController
public class GlamMartController {
	@Autowired
	public GlamMartService serv;
	
	//post mapping
	@PostMapping("/postPro")
	public String postmatrix(@RequestBody GlamMartModel mr)
	{
		serv.saveMatrix(mr);
		return "your data is saved in database";
	}
	
	//get mapping
	@GetMapping("/getPro")
	public  List<GlamMartModel> getmatrix()
	{
		return serv.getMatrix();
	}
	
	//put mapping
	@PutMapping("/putPro")
	public GlamMartModel updatematrix(@RequestBody GlamMartModel mrs)
	{
		return serv.updatematrix(mrs);
	}
	//delete mapping using path variable
	@DeleteMapping("/deletePro/{id}")
	public String removematrix (@PathVariable("id") int id)
	{
		serv.deletematrix(id);
		return "Product with id "+id+" is deleted";
	}
	
	
	@DeleteMapping("/byReqParm")
	public String removeByRequest(@RequestParam ("id") int id)
	{
		serv.deletematrix(id);
		return "Product with id "+id+" is deleted";
	}
	
	//if there is no id
	@DeleteMapping("/deleteProif/{id}")
	public ResponseEntity<String> deleteMatrix(@PathVariable int id){
		boolean deleted = serv.deletematrixif(id);
		if(deleted) {
			return ResponseEntity.ok("Product with ID "+id+" deleted successfully");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product with ID "+id+" not found");
		}
	}
	//getUserById
		@GetMapping("users/{userId}")
		public ResponseEntity<?> getUserById(@PathVariable int userId)
		{
	         Optional<GlamMartModel> product = serv.getuserById(userId);
			if(product != null) {
				return ResponseEntity.ok(product);
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(product);
		}
}
