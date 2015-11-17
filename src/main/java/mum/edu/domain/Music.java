package mum.edu.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Music {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String title;
	private String singer;
	private String composer;
	private String writer;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="album_id")
	private Album album;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="music_id")
	private List<Category> categories = new ArrayList<Category>();
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private String lyrics;
	
	public Music(String title, String singer, String composer, String writer, String lyrics) {
		super();
		this.title = title;
		this.singer = singer;
		this.composer = composer;
		this.writer = writer;
	}
	
	public Music(String title, String singer, String composer, String writer, Album album,
			String lyrics) {
		super();
		this.title = title;
		this.singer = singer;
		this.composer = composer;
		this.writer = writer;
		this.album = album;
		this.lyrics = lyrics;
	}
	
	public Music(String title, String singer, String composer, String writer, List<Category> categories,
			String lyrics) {
		super();
		this.title = title;
		this.singer = singer;
		this.composer = composer;
		this.writer = writer;
		this.categories = categories;
		this.lyrics = lyrics;
	}
	
	public Music(String title, String singer, String composer, String writer, Album album, List<Category> categories,
			String lyrics) {
		super();
		this.title = title;
		this.singer = singer;
		this.composer = composer;
		this.writer = writer;
		this.album = album;
		this.categories = categories;
		this.lyrics = lyrics;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public List<Category> getCatogaries() {
		return categories;
	}

	public void setCatogaries(List<Category> categories) {
		this.categories = categories;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	
	
}
