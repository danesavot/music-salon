package mum.edu.service.impl;

import java.util.List;

import mum.edu.domain.Category;
import mum.edu.repository.CategoryRepository;
import mum.edu.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	private CategoryRepository categoryDao;
	
	public void setCategoryDao(CategoryRepository categoryDao){
		this.categoryDao = categoryDao;
	}
	
	public void addNewCategory(Category category){
		categoryDao.add(category);
	}
	
	public List<Category> getCategoryList() {
		return categoryDao.getCategoryList();
	}
	
	public Category getCategory(int id){
		return categoryDao.get(id);
	}

	public void updateCategory(int categoryId, Category category){
		categoryDao.update(categoryId, category);
	}

	public void deleteCategory(Category category){
		categoryDao.delete(category);
	}
	
}
