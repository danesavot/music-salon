package mum.edu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String albumName;
	@OneToMany(mappedBy="album", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Music> musicList = new ArrayList<Music>(); 
	
	private String publisher;
	@Temporal(TemporalType.DATE)
	private Date date;
}
