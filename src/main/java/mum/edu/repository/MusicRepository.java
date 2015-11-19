package mum.edu.repository;

import java.util.Set;

import mum.edu.domain.Category;
import mum.edu.domain.Music;

public interface MusicRepository extends BaseRepository<Music> {
	public Set<Music> getMusicList(Category category);
}
