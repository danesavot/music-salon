package mum.edu.repository.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import mum.edu.domain.Album;
import mum.edu.repository.AlbumRepository;
public class AlbumRepositoryImpl implements AlbumRepository{
	private SessionFactory sf;
    
    public void setSessionFactory(SessionFactory sf) {
        this.sf = sf;
    }
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Album> getAlbumList() {
        Query query = sf.getCurrentSession().createQuery("from Album ");
		List<Album> categories = query.list();
		return categories;
	}
	
	@Override
	public void add(Album album) {
		sf.getCurrentSession().persist(album);
	}
	
	@Override
	public Album get(int id) {
		return (Album) sf.getCurrentSession().get(Album.class, id);
	}
	
	@Override
	public void update(int albumId, Album album) {
		sf.getCurrentSession().saveOrUpdate(album);
	}
	
	@Override
	public void delete(Album album) {
		sf.getCurrentSession().delete(album);
	}
}
