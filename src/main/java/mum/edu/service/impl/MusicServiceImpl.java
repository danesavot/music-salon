package mum.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.domain.Album;
import mum.edu.domain.Category;
import mum.edu.domain.Music;
import mum.edu.repository.CategoryRepository;
import mum.edu.repository.MusicRepository;
import mum.edu.service.MusicService;

@Service
@Transactional
public class MusicServiceImpl implements MusicService{
	@Autowired
	private CategoryRepository categoryDao;
	@Autowired
	private MusicRepository musicDao;

	@Override
	public void addNewMusic(Music music, Album album, Category category){
		music.setAlbum(album);
		List<Category> categories =  music.getCategoryList();
		
		categories.add(category);
		music.setCategoryList(categories);
		
		categoryDao.add(category);
		addNewMusic(music);
	}
	
	@Override
	public void addNewMusic(Music music){
		musicDao.add(music);
	}
	
	@Override
	public List<Music> getAll() {
		return musicDao.getAll();
	}
	
	@Override
	public List<Music> getMusicList(Category category) {
		return musicDao.getMusicList(category);
	}
	
	@Override
	public Music getMusic(long id){
		return musicDao.get(id);
	}

	@Override
	public void updateMusic(Music music){
		musicDao.update(music);
	}
	
	@Override
	public void deleteMusic(long id){
		musicDao.delete(id);
	}

}
