package mum.edu.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.domain.Album;
import mum.edu.repository.AlbumRepository;
import mum.edu.service.AlbumService;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {
	
	@Autowired
	private AlbumRepository albumDao;
	
		
	public void addNewAlbum(Album album){
		albumDao.add(album);
	}
	
	public Set<Album> getAlbumList() {
		return albumDao.getAll();
	}
	
	public Album getAlbum(long id){
		return albumDao.get(id);
	}

	public void updateAlbum(Album album){
		albumDao.update(album);
	}

	public void deleteAlbum(Album album){
		albumDao.delete(album);
	}
}
