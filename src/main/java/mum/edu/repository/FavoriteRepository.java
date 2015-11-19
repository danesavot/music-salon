package mum.edu.repository;

import java.util.List;

import mum.edu.domain.Favorite;

public interface FavoriteRepository extends BaseRepository<Favorite>{
	
	public List<Favorite> get(int id);
	
}
