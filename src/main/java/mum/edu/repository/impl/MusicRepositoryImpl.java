package mum.edu.repository.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mum.edu.domain.Category;
import mum.edu.domain.Music;
import mum.edu.repository.MusicRepository;

@Repository
public class MusicRepositoryImpl extends BaseRepositoryImpl<Music> implements MusicRepository {

	@Autowired
	protected SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public Set<Music> getMusicList(Category category) {
        Query query = sessionFactory.getCurrentSession().createQuery("select m from Music m join m.categoryList c where c.id = :categoryId");
        query.setParameter("categoryId", category.getId());
		List<Music> musicList = query.list();
		return new HashSet<Music>(musicList);
	}

	@Override
	public List<Music> getMusicList(Long albumID) {
		return sessionFactory.getCurrentSession().createQuery("from Music m where m.album.id=" + albumID).list();
	}

}
