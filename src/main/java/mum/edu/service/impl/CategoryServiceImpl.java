package mum.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.domain.Category;
import mum.edu.repository.CategoryRepository;
import mum.edu.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryDao;
	
	@Override
	public void addNewCategory(Category category){
		categoryDao.add(category);
	}
	
	@Override
	public List<Category> getCategoryList() {
		return categoryDao.getAll();
	}
	
	@Override
	public Category getCategory(long id){
		return categoryDao.get(id);
	}

	@Override
	public void updateCategory(Category category){
		categoryDao.update(category);
	}
	
	@Override
	public void deleteCategory(long id){
		categoryDao.delete(id);
	}	
}
