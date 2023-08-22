package com.example.demo.Table.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Table.model.SchoolModel;
import com.example.demo.Table.service.SchoolService;
@RestController
public class SchoolController {
 @Autowired
public SchoolService schservice;
 @PostMapping("/postSchool")
 public SchoolModel saveSchoolDetails(@RequestBody SchoolModel sb)
 {
	 return  schservice.saveDetails(sb);
	 
 }
 //deletion
 @DeleteMapping("/deleteStudent/{Id}")
	public ResponseEntity<String> delete(@PathVariable int Id){
		boolean deleted = schservice.deleteHotelif(Id);
		if(deleted) {
			return ResponseEntity.ok("School with ID "+Id+" deleted successfully");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("School with ID "+Id+" not found");
		}
	}
//getUserById
	@GetMapping("users/{userId}")
	public ResponseEntity<?> getUserById(@PathVariable int userId)
	{
       Optional<SchoolModel> school = schservice.getuserById(userId);
		if(school != null) {
			return ResponseEntity.ok(school);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(school);
	}
}
