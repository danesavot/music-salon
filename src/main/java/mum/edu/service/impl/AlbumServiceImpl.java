package mum.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.domain.Album;
import mum.edu.repository.AlbumRepository;
import mum.edu.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {
	@Autowired
	private AlbumRepository albumRepository;
	
	public void addNewAlbum(Album album){
		albumRepository.add(album);
	}
	
	public List<Album> getAlbumList() {
		return albumRepository.getAll();
	}
	
	public Album getAlbum(long id){
		return albumRepository.get(id);
	}

	public void updateAlbum(Album album){
		albumRepository.update(album);
	}

	public void deleteAlbum(long id){
		albumRepository.delete(id);
	}
}
