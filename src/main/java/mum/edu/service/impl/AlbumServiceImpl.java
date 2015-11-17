package mum.edu.service.impl;

import java.util.List;

import mum.edu.domain.Album;
import mum.edu.repository.AlbumRepository;
import mum.edu.service.AlbumService;

public class AlbumServiceImpl implements AlbumService {
	private AlbumRepository albumDao;
	
	public void setAlbumDao(AlbumRepository albumDao){
		this.albumDao = albumDao;
	}
	
	public void addNewAlbum(Album album){
		albumDao.add(album);
	}
	
	public List<Album> getAlbumList() {
		return albumDao.getAlbumList();
	}
	
	public Album getAlbum(int id){
		return albumDao.get(id);
	}

	public void updateAlbum(int albumId, Album album){
		albumDao.update(albumId, album);
	}

	public void deleteAlbum(Album album){
		albumDao.delete(album);
	}
	
}
