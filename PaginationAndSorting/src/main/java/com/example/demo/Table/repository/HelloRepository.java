package com.example.demo.Table.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Table.model.HelloModel;

public interface HelloRepository extends JpaRepository< HelloModel,Integer> {

}
