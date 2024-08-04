package com.purplehaze.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purplehaze.course.entities.Category;
import com.purplehaze.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
		
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
		
	public Category findById(Long id) {
		Optional <Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
}
