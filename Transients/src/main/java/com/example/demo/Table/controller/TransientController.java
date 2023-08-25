package com.example.demo.Table.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Table.model.TransientModel;
import com.example.demo.Table.service.TransientService;

@RestController
public class TransientController {
	@Autowired
	public TransientService tserv;
	
	//posting the data
	@PostMapping("/postDetails")
	public String insertingDetails(@RequestBody TransientModel t)
	{
		 tserv.postData(t);
		 return "Your data is saved successfully";
	}
	@GetMapping("/getDetails")
	public List<TransientModel> gettingData(){
		return tserv.getData();
	}

}