package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {
	@Value(value="${myName}")
	public String studentName;
	@Value(value="${age:18}")
	public int age;
	@GetMapping("/student")
	public String display()
	{
		return "My Name is "+studentName +" and my age is "+age;
	}

}
