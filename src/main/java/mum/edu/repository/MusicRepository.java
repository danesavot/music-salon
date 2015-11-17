package mum.edu.repository;

import java.util.List;

import mum.edu.domain.Category;
import mum.edu.domain.Music;


public interface MusicRepository {

	public abstract List<Music> getMusicList(Category category);
	
	public abstract void add(Music music);

	public abstract Music get(int id);

	public abstract void update(int musicId, Music music);

	public abstract void delete(Music music);
	
}
