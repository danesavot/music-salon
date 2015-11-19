package mum.edu.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import mum.edu.domain.Album;
import mum.edu.repository.AlbumRepository;

@Repository
public class AlbumRepositoryImpl extends BaseRepositoryImpl<Album> implements AlbumRepository {
	
	public List<Album> getAllAlbums() {
		
		return sessionFactory.getCurrentSession().createQuery("from Album").list();
	}

}
