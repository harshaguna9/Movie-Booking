package com.moviebookingspring.moviebooking.entity;

import java.util.Objects;

import javax.persistence.*;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	private String title;
	private String releaseDate;
	@OneToOne(cascade=CascadeType.ALL)
	private Screen screen;
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public Movie() {
		super();
	}
	public Movie(long Id,String title, String releaseDate) {
		super();
		this.Id=Id;
		this.title = title;
		this.releaseDate = releaseDate;
	}
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Id, releaseDate, screen, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Id == other.Id && Objects.equals(releaseDate, other.releaseDate) && Objects.equals(screen, other.screen)
				&& Objects.equals(title, other.title);
	}
	
}
