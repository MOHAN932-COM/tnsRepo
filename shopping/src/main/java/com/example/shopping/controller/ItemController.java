package com.example.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping.model.Item;
import com.example.shopping.service.ItemServices;
@RestController
public class ItemController {
	 @Autowired
	    private ItemServices is;

	    
	    @PostMapping("/add")
	    public Item addItem(@RequestBody Item item) {
	        return is.addItem(item);
	    }

	    
	    @GetMapping("/all")
	    public List<Item> getItems() {
	        return is.getItems();
	    }
	    
	    @PutMapping("/update/{id}")
	    public Item updateItem(@PathVariable Long id, @RequestBody Item itemDetails) {
	        return is.updateItem(id, itemDetails);
	    }


	    
	    @DeleteMapping("/delete/{id}")
	    public void deleteItem(@PathVariable Long id) {
	        is.deleteItem(id);
	    }

}
