package mum.edu.repository;

import java.util.List;

import mum.edu.domain.Album;


public interface AlbumRepository {

	public abstract List<Album> getAlbumList();

	public abstract void add(Album album);

	public abstract Album get(int id);

	public abstract void update(int albumId, Album album);

	public abstract void delete(Album album);
	
}
