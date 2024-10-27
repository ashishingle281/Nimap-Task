package com.example.service;

public class Service {
	
	  public Page<Category> getAllCategories(Pageable pageable) {
	        return categoryRepository.findAll(pageable);
	    }

}
