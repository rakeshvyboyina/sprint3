package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Login;
import com.example.demo.service.FoodStoreService;


@RestController
public class FoodStoreController {

	@Autowired
	FoodStoreService foodstoreservice;
	
	
	@GetMapping("/login")
	public Login login(@RequestHeader String email, @RequestHeader String password) {
		
		return foodstoreservice.login(email,password);
	}
 /*
	@PostMapping("/post")
	public Login addlogin(@RequestBody Login login) {
		
		return foodstoreservice.addlogin(login);
	}
	
	@PutMapping("/update")
	public Login update(@RequestHeader String email , @RequestBody String password ) {
		
		return foodstoreservice.updatedb(email, password);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String email) {
		foodstoreservice.Delete(email);
		return "data deleted";
	}
	*/
	
}
