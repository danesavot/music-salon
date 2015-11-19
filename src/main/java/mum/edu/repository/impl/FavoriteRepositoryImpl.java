package mum.edu.repository.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mum.edu.domain.Favorite;
import mum.edu.repository.FavoriteRepository;

@Repository
public class FavoriteRepositoryImpl extends BaseRepositoryImpl<Favorite> implements FavoriteRepository {

	@Autowired
	protected SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Favorite> get(int id) {
		Query query = sessionFactory.getCurrentSession().createQuery("select f from Favorite f where f.member.id = :id");
        query.setParameter("id", id);
		List<Favorite> favorites = query.list();
		return favorites;
	}
	
}
