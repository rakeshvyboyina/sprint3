package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

@RestController
public class ItemController {

		@Autowired
		ItemService itemservice;
		

		@PostMapping("/post")
		public Item addItem( @RequestBody Item item) {
			return itemservice.addItem(item);
		}
		
		@PutMapping("/update")
		public Item update(@RequestHeader String name,@RequestBody Item item) {
			
			return itemservice.updatedb(name, item);
			
			
		}
		
		@DeleteMapping("/delete")
		public String delete(@RequestHeader String  name) {
	        itemservice.Delete(name);
			
			return "data deleted";
		

	}

	
	
}