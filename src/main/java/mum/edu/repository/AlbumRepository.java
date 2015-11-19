package mum.edu.repository;

import java.util.List;

import mum.edu.domain.Album;

public interface AlbumRepository extends BaseRepository<Album> {

	List<Album> getAllAlbums();

}
