package mum.edu.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Music {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotEmpty(message = "{NotEmpty}")
	private String title;
	@NotEmpty(message = "{NotEmpty}")
	private String singer;
	private String composer;
	private String writer;
	
	@NotNull(message = "{NotNull}")
	@Transient
	@JsonIgnore
	private MultipartFile file;
	private String fileName;

	@NotNull(message = "{NotNull}")
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="album_id")
	private Album album;
	
	@NotNull(message = "{NotNull}")
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name="music_category")
	private Set<Category> categoryList = new HashSet<Category>();
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private String lyrics;
	
	public MultipartFile getMultipartFile() {
		return file;
	}

	public void setMultipartFile(MultipartFile file) {
		this.file = file;
	}

	public Music() {
		super();
	}

	public Music(String title, String singer, String composer, String writer, MultipartFile file, Album album,
			Set<Category> categoryList, String lyrics) {
		super();
		this.title = title;
		this.singer = singer;
		this.composer = composer;
		this.writer = writer;
		this.file = file;
		this.album = album;
		this.categoryList = categoryList;
		this.lyrics = lyrics;
	}

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
	
	public Music(String title, String singer, String composer, String writer, Set<Category> categoryList,
			String lyrics) {
		super();
		this.title = title;
		this.singer = singer;
		this.composer = composer;
		this.writer = writer;
		this.categoryList = categoryList;
		this.lyrics = lyrics;
	}
	
	public Music(String title, String singer, String composer, String writer, Album album, Set<Category> categoryList,
			String lyrics) {
		super();
		this.title = title;
		this.singer = singer;
		this.composer = composer;
		this.writer = writer;
		this.album = album;
		this.categoryList = categoryList;
		this.lyrics = lyrics;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
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

	public Set<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(Set<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}	
}
