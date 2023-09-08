package com.example.demo.service;

import com.example.StudentDatabase.entity.Student;
import com.example.demo.entity.Login;

public interface FoodStoreService {

	Login login(String email, String password);
	
	
	Login addlogin(Login login);

	Login updatedb(String email, String password);

	
	void Delete(String email);

	

}
