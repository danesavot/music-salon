package mum.edu.service.impl;

import java.util.List;

import mum.edu.domain.Album;
import mum.edu.domain.Category;
import mum.edu.domain.Music;
import mum.edu.repository.CategoryRepository;
import mum.edu.repository.MusicRepository;

public class MusicServiceImpl {
	private CategoryRepository categoryDao;
	private MusicRepository musicDao;
	
	public void setMusicDao(MusicRepository musicDao){
		this.musicDao = musicDao;
	}

	public void setCategoryDao(CategoryRepository categoryDao){
		this.categoryDao = categoryDao;
	}
	
	public void addNewMusic(Music music, Album album, Category category){
		music.setAlbum(album);
		List<Category> categories =  music.getCatogaries();
		
		categories.add(category);
		music.setCatogaries(categories);
		
		
		categoryDao.add(category);
		musicDao.add(music);
	}
	
	public List<Music> getMusicList(Category category) {
		return musicDao.getMusicList(category);
	}
	
	public Music getMusic(int id){
		return musicDao.get(id);
	}

	public void updateMusic(int musicId, Music music){
		musicDao.update(musicId, music);
	}

	public void deleteMusic(Music music){
		musicDao.delete(music);
	}
	
}
