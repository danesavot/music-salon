package mum.edu.service;

import java.util.List;

import mum.edu.domain.Album;

public interface AlbumService {

	public abstract void addNewAlbum(Album album);
	
	public abstract List<Album> getAlbumList();
	
	public abstract Album getAlbum(long id);

	public abstract void updateAlbum(Album album);

	public abstract void deleteAlbum(long id);
}
