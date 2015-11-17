package mum.edu.service;

import java.util.List;

import mum.edu.domain.Album;
import mum.edu.domain.Category;
import mum.edu.domain.Music;

public interface MusicService {

	public abstract void addNewMusic(Music music, Album album, Category category);
	
	public abstract List<Music> getMusicList(Category category);
	
	public abstract Music getMusic(int id);

	public abstract void updateMusic(int musicId, Music music);

	public abstract void deleteMusic(Music music);
	
}
