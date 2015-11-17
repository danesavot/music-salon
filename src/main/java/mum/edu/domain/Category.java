package mum.edu.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String category;
	private boolean navigator;

	public Category(String category) {
		super();
		this.category = category;
	}

	public Category(String category, boolean navigator) {
		super();
		this.category = category;
		this.navigator = navigator;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public boolean isNavigator() {
		return navigator;
	}

	public void setNavigator(boolean navigator) {
		this.navigator = navigator;
	}
}
