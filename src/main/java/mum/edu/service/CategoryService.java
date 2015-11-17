package mum.edu.service;

import java.util.List;

import mum.edu.domain.Category;

public interface CategoryService {

	public abstract void addNewCategory(Category category);
	
	public abstract List<Category> getCategoryList();
	
	public abstract Category getCategory(int id);

	public abstract void updateCategory(int categoryId, Category category);

	public abstract void deleteCategory(Category category);
	
}
