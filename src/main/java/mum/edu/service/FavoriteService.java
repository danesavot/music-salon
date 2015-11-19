package mum.edu.service;

import java.util.List;

import mum.edu.domain.Favorite;
import mum.edu.domain.Member;

public interface FavoriteService {
	
	/**
	 * @param favorite
	 * Adds favorite song to DB
	 */
	public void addFavorite(Favorite favorite);

	public List<Favorite> getFavorites(int id);



}
