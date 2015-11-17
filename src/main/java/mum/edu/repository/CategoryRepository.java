package mum.edu.repository;

import java.util.List;

import mum.edu.domain.Category;


public interface CategoryRepository {

	public abstract List<Category> getCategoryList();

	public abstract void add(Category category);

	public abstract Category get(int id);

	public abstract void update(int categoryId, Category category);

	public abstract void delete(Category category);
	
}
