package mum.edu.repository.impl;

import org.springframework.stereotype.Repository;

import mum.edu.domain.Category;
import mum.edu.repository.CategoryRepository;

@Repository
public class CategoryRepositoryImpl extends BaseRepositoryImpl<Category> implements CategoryRepository {

}
