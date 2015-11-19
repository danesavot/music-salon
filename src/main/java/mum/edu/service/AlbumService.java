package mum.edu.service;

import java.util.Set;

import mum.edu.domain.Album;

public interface AlbumService {

	public abstract void addNewAlbum(Album album);
	
	public abstract Set<Album> getAlbumList();
	
	public abstract Album getAlbum(long id);

	public abstract void updateAlbum(Album album);

	public abstract void deleteAlbum(Album album);
	
}
