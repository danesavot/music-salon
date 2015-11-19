package mum.edu.service;

import java.util.Set;

import mum.edu.domain.Category;

public interface CategoryService {

	public abstract void addNewCategory(Category category);
	
	public abstract Set<Category> getCategoryList();
	
	public abstract Category getCategory(long id);

	public abstract void updateCategory(Category category);

	public abstract void deleteCategory(Category category);
	
}
