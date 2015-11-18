package mum.edu.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private boolean navigation;
	
	@ManyToMany(mappedBy="categoryList")
	private List<Music> musicList = new ArrayList<Music>();

	public Category() {
		super();
	}

	public List<Music> getMusicList() {
		return musicList;
	}

	public void setMusicList(List<Music> musicList) {
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
