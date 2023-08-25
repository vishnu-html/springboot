package com.example.demo.Table.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Table.model.TransientModel;

public interface TransientRepository extends JpaRepository< TransientModel,Integer> {

}