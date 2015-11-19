package mum.edu.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotEmpty(message = "{NotEmpty}")
	private String name;
	@OneToMany(mappedBy="album", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Music> musicList = new HashSet<Music>(); 
	
	private String publisher;
	@Temporal(TemporalType.DATE)
	private Date date;

	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Album(String name, Set<Music> musicList, String publisher, Date date) {
		super();
		this.name = name;
		this.musicList = musicList;
		this.publisher = publisher;
		this.date = date;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Music> getMusicList() {
		return musicList;
	}
	public void setMusicList(Set<Music> musicList) {
		this.musicList = musicList;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
