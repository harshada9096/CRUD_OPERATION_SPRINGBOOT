package com.crud.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.test.dao.CategoryDao;
import com.crud.test.entity.Category;
import com.crud.test.entity.Product;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao dao;
	
	@Override
	public boolean addCategory(Category category) {
		boolean b=dao.addCategory(category);
		return b;
	}

	@Override
	public Category getCategory(int id) {
	Category category= dao.getCategory(id);
		
		return category;
	}

	@Override
	public List<Category> listOfCategory() {
		List<Category> list= dao.listOfCategory();
		return list;
	}

	@Override
	public boolean deleteCategory(int id) {
		boolean b= dao.deleteCategory(id);
		return b;
	}

	@Override
	public String updateCategory(Category category) {
		String msg=dao.updateCategory(category);
		return msg;
	}
	

}
