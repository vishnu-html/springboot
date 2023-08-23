package com.example.demo.Table.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Table.model.GlamMartModel;


public interface GlamMartRepository extends JpaRepository<GlamMartModel, Integer> {

}