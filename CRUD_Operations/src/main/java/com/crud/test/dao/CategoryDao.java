package com.crud.test.dao;

import java.util.List;

import com.crud.test.entity.Category;


public interface CategoryDao {
	boolean addCategory(Category category);
	Category getCategory(int id);
	 List<Category> listOfCategory();
	 boolean deleteCategory(int id);
	 String updateCategory(Category category);
	

	
}
