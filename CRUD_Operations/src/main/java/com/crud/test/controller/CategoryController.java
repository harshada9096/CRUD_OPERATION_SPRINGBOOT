package com.crud.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.test.entity.Category;
import com.crud.test.entity.Product;
import com.crud.test.service.CategoryService;


@RestController
@RequestMapping("api/category")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@PostMapping(value="/save")
	public boolean saveCategory(@RequestBody Category category) {
		
		boolean b= service.addCategory(category);	
		return b;	
	}

	@DeleteMapping(value="/delete")
	public boolean deleteCategory(@RequestParam int id) {
		boolean b= service.deleteCategory(id);
		return b;		
	}
	
	@PutMapping(value="/update")
	public String updateCategory(@RequestBody Category category) {
	String msg=	service.updateCategory(category);
		return msg;
		
	}
	
	@GetMapping(value="/getCategory")
	public Category getCategory(@RequestParam int id) {
		Category category= service.getCategory(id);
		return category;
		
	}
	@GetMapping(value="/list")
	public List<Category> listOfCategory(Category category){
		List<Category> list= service.listOfCategory();	
		return list;	
	}
	
	
}
