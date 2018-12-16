package com.niit.backendproject.dao;

import java.util.List;

import com.niit.backendproject.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get (int id);
	
}
