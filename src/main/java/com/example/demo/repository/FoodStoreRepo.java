package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Login;

public interface FoodStoreRepo extends JpaRepository<Login,String> {

	
	@Query(value =  "select * from Login where email =?" , nativeQuery = true)
	Login findByEmail(String email);
}
