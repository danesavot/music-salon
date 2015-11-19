package mum.edu.repository;

import java.util.Set;

public interface BaseRepository<T> {
	
	T add(T t);

	T update(T t);

	boolean delete(T t);

	T get(long id);
	
	Set<T> getAll();

}
