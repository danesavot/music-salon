package mum.edu.service;

import java.util.List;
import java.util.Set;

import mum.edu.domain.Album;
import mum.edu.domain.Category;
import mum.edu.domain.Music;

public interface MusicService {
	
	public abstract void addNewMusic(Music music);

	public abstract void addNewMusic(Music music, Album album, Category category);
	
	public abstract List<Music> getAll();

	public abstract Set<Music> getMusicList(Category category);
	
	public abstract Music getMusic(long id);

	public abstract void updateMusic(Music music);

	public abstract void deleteMusic(Music music);
}
