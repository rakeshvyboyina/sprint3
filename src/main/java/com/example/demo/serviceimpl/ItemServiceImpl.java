package com.example.demo.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ItemRepository;
import com.example.demo.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

		@Autowired
	    ItemRepository itemrepository;
		
		@Override
	    public Item addItem(Item item) {
		// TODO Auto-generated method stub
			return itemrepository.save(item);
		}

		@Override
		public Item updatedb(String name, Item item) {
			// TODO Auto-generated method stub
			Item p1 = itemrepository.findByName(name);
			
			if( p1 != null ) {
				// p1.setName(p1.getName());
				p1.setDescription(item.getDescription());
				p1.setImageUrl(item.getImageUrl());

				return itemrepository.save(item);
				
			}else {
				throw new ResourceNotFoundException();
			}
		}

		@Override
		public void Delete(String name) {
			// TODO Auto-generated method stub
			Item s2 = itemrepository.findByName(name);
			
			if(s2!=null) {
				itemrepository.delete(s2);
			}
			else {
				throw new ResourceNotFoundException();
			}
			
		}


	
}
