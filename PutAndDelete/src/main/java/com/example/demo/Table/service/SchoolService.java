package com.example.demo.Table.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Table.model.SchoolModel;
import com.example.demo.Table.repository.SchoolRepository;

@Service
public class SchoolService {
  @Autowired
  SchoolRepository schrepo;
  public SchoolModel saveDetails(SchoolModel s)
  {
	  return	schrepo.save(s);
	
  }
  public List<SchoolModel> getDetails()
  {
	  return schrepo.findAll();
  }
  public void deleteHotel(int hotel_Id) {
		System.out.println("Deleted");
		schrepo.deleteById(hotel_Id);
	}

	public boolean deleteHotelif(int hotel_id) {
		if(schrepo.existsById(hotel_id)) {
			schrepo.deleteById(hotel_id);
			return true;
		}
		else {       
           return false;
		}
	}
	//getUserId
    @GetMapping("/users/userId")
    
    public Optional<SchoolModel> getuserById(int userId)
    {
    	Optional<SchoolModel> hotel = schrepo.findById(userId);
    	if(hotel.isPresent()) {
    		return hotel;
    	}
    	else
    	{
    		return null;
    	}
    }
}
