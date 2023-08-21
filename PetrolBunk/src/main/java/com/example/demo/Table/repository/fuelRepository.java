package com.example.demo.Table.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Table.model.PetrolBunk;


public interface fuelRepository extends JpaRepository<PetrolBunk, Integer> {
	
}
