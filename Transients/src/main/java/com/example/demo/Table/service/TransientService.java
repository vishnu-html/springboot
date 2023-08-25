package com.example.demo.Table.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Table.model.TransientModel;
import com.example.demo.Table.repository.TransientRepository;

@Service
public class TransientService {
	@Autowired
	public TransientRepository trepo;
	
	//post data
	public String postData(TransientModel t)
	{
		trepo.save(t);
		return "Your data is saved successfully";
	}
	//transient
	public List<TransientModel> getData()
	{
		return trepo.findAll();
	}

}