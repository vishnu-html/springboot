package com.example.demo.Table.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Table.model.SchoolModel;

public interface SchoolRepository extends JpaRepository< SchoolModel,Integer> {

}
