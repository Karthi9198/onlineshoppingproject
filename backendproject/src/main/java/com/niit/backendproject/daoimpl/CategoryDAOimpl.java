package com.niit.backendproject.daoimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.niit.backendproject.dao.CategoryDAO;
import com.niit.backendproject.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	private static List<Category> categories=new ArrayList<>();
	
	static {
		Category  category = new Category();
		category.setId(1);
		category.setName("Story Books");
		category.setDescription("Description for Story books");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		
		category = new Category();
		category.setId(2);
		category.setName("Engineering Books");
		category.setDescription("Description for Engineering books");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Literatures");
		category.setDescription("Description for Literatures");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
		
		
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
