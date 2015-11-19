package mum.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.domain.Favorite;
import mum.edu.repository.FavoriteRepository;
import mum.edu.service.FavoriteService;
@Service
@Transactional
public class FavoriteServiceImpl implements FavoriteService {

 	@Autowired
	private FavoriteRepository FavoriteRepository;
	
	@Override
	public void addFavorite(Favorite favorite) {
		FavoriteRepository.add(favorite);
	}

	@Override
	public List<Favorite> getFavorites(int id) {
		return FavoriteRepository.get(id);
	}

}
