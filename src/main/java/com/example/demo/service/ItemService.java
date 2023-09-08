package com.example.demo.service;

import com.example.demo.entity.Item;

public interface ItemService {
	

	    Item addItem(Item item);

		Item updatedb(String name, Item item );
	
		void Delete(String name );

	   

}
