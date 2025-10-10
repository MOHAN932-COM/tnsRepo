package com.example.shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopping.model.Item;

// Marker interface for Item CRUD
public interface ItemRepo extends JpaRepository<Item, Long> {

}
