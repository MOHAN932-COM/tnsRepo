package com.example.shopping.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping.model.Item;
import com.example.shopping.repo.ItemRepo;

@RestController
public class ItemServices {


	    @Autowired
	    private ItemRepo itemRepo;

	    // Add / Insert item
	    public Item addItem(Item item) {
	        return itemRepo.save(item);
	    }

	    // Retrieve all items
	    public List<Item> getItems() {
	        return itemRepo.findAll();
	    }

	    // Update item by ID
	    public Item updateItem(Long id, Item itemDetails) {
	        // Assuming your Item entity has a String id
	        Item item = itemRepo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Item not found with id " + id));

	        item.setName(itemDetails.getName());
	        item.setCategory(itemDetails.getCategory());
	        item.setPrice(itemDetails.getPrice());
	        item.setManufacturing(itemDetails.getManufacturing());
	        item.setExpiry(itemDetails.getExpiry());

	        return itemRepo.save(item);
	    }

	    // Delete item by ID
	    public void deleteItem( Long id) {
	        itemRepo.deleteById(id);
	    }
	}