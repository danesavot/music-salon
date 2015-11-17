package mum.edu.repository;

import java.util.List;

public interface BaseRepository<T> {
	
	T add(T t);

	T update(T t);

	boolean delete(long id);

	T get(long id);
	
	List<T> getAll();

}
