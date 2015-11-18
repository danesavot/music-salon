package mum.edu.repository;

import java.util.List;

import mum.edu.domain.Category;
import mum.edu.domain.Music;

public interface MusicRepository extends BaseRepository<Music> {
	public List<Music> getMusicList(Category category);
}
