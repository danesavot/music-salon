package mum.edu.repository.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import mum.edu.domain.Category;
import mum.edu.domain.Music;
import mum.edu.repository.MusicRepository;

public class MusicRepositoryImpl implements MusicRepository {
	private SessionFactory sf;
    
    public void setSessionFactory(SessionFactory sf) {
        this.sf = sf;
    }
	
	public MusicRepositoryImpl() {

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Music> getMusicList(Category category) {
        Query query = sf.getCurrentSession().createQuery("select m from Music m join m.categories c where c.category = :categoryName");
        query.setParameter("categoryName", "Pop");
		List<Music> musicList = query.list();
		return musicList;
	}
	
	@Override
	public void add(Music music) {
		sf.getCurrentSession().persist(music);
	}
	
	@Override
	public Music get(int id) {
		return (Music) sf.getCurrentSession().get(Music.class, id);
	}
	
	@Override
	public void update(int musicId, Music music) {
		sf.getCurrentSession().saveOrUpdate(music);
	}
	
	@Override
	public void delete(Music music) {
		sf.getCurrentSession().delete(music);
	}
}
