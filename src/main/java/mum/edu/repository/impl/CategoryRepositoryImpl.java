package mum.edu.repository.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import mum.edu.domain.Category;
import mum.edu.repository.CategoryRepository;
public class CategoryRepositoryImpl implements CategoryRepository{
	private SessionFactory sf;
    
    public void setSessionFactory(SessionFactory sf) {
        this.sf = sf;
    }
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getCategoryList() {
        Query query = sf.getCurrentSession().createQuery("from Category ");
		List<Category> categories = query.list();
		return categories;
	}
	
	@Override
	public void add(Category category) {
		sf.getCurrentSession().persist(category);
	}
	
	@Override
	public Category get(int id) {
		return (Category) sf.getCurrentSession().get(Category.class, id);
	}
	
	@Override
	public void update(int categoryId, Category category) {
		sf.getCurrentSession().saveOrUpdate(category);
	}
	
	@Override
	public void delete(Category category) {
		sf.getCurrentSession().delete(category);
	}
}
