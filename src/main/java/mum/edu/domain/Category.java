package mum.edu.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotEmpty(message = "{NotEmpty}")
	private String name;
	private boolean navigation;
	
	@ManyToMany(mappedBy="categoryList")
	private Set<Music> musicList = new HashSet<Music>();

	public Category() {
		super();
	}

	public Set<Music> getMusicList() {
		return musicList;
	}

	public void setMusicList(Set<Music> musicList) {
		this.musicList = musicList;
	}

	public Category(String name) {
		super();
		this.name = name;
	}

	public Category(String name, boolean navigation) {
		super();
		this.name = name;
		this.navigation = navigation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isNavigation() {
		return navigation;
	}

	public void setNavigation(boolean navigator) {
		this.navigation = navigator;
	}
}
