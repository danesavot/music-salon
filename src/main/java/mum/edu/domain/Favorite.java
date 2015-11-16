package mum.edu.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Favorite {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	@OneToOne
	private Member member;
	
	@OneToMany
	@JoinColumn(name = "music_id")
	List<Music> musicList = new ArrayList<>();
	
	public Favorite(String name, Member member) {
		super();
		this.name = name;
		this.member = member;
	}

	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addMusic(Music music) {
		
		musicList.add(music);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	
}
