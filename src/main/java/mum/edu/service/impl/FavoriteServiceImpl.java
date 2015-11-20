package mum.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.domain.Favorite;
import mum.edu.domain.Member;
import mum.edu.repository.FavoriteRepository;
import mum.edu.service.FavoriteService;
@Service
@Transactional
public class FavoriteServiceImpl implements FavoriteService {

 	@Autowired
	private FavoriteRepository favoriteRepository;
	
	@Override
	public void addFavorite(Favorite favorite) {
		favoriteRepository.add(favorite);
	}

	@Override
	public List<Favorite> getFavorites(int id) {
		return favoriteRepository.get(id);
	}

	@Override
	public void updateFavorite(Favorite favorite) {
		// TODO Auto-generated method stub
		favoriteRepository.update(favorite);
		
	}


}
