package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.FoodStoreRepo;
import com.example.demo.service.FoodStoreService;

@Service
public class FoodStoreServiceImpl implements FoodStoreService  {
 
	@Autowired
	FoodStoreRepo foodstorerepo;
	
	@Override
	public Login login(String email, String password) {
		// TODO Auto-generated method stub
	Login s1 = foodstorerepo.findByEmail(email);
	
	 if(s1!=null) {
		 if(s1.getEmail().equals(email)) {
			 return s1;
		 }else {
			throw new ResourceNotFoundException();
		}
	 }else {
		 throw new ResourceNotFoundException();
	 }
	 
	}
	
	@Override
	public Login addlogin(Login login) {
		// TODO Auto-generated method stub
		return  foodstorerepo.save(login);
	}

	@Override
	public Login updatedb(String email, String password) {
		// TODO Auto-generated method stub
		
		Login s2 = foodstorerepo.findByEmail(email);
		
		if(s2!=null) {
			s2.setPassword(s2.getPassword());
		return foodstorerepo.save(s2);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	@Override
	public void Delete(String email) {
		// TODO Auto-generated method stub
		
		Login s3 = foodstorerepo.findByEmail(email);
		
		if(s3!=null) {
			foodstorerepo.delete(s3);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}
	
	

}
