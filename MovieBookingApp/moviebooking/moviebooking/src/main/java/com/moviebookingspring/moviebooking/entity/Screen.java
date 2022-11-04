
package com.moviebookingspring.moviebooking.entity;

import java.util.Objects;

import javax.persistence.*;

@Entity
public class Screen {

	@Id
	private long Id;
	private String type;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	@OneToOne(cascade=CascadeType.ALL)
	private Movie movie; 
	
//	@ManyToOne(cascade=CascadeType.ALL)
//	private PVR pvr;
	
//	public PVR getPvr() {
//		return pvr;
//	}
//	public void setPvr(PVR pvr) {
//		this.pvr = pvr;
//	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Screen(long Id,String type) {
		super();
		this.Id=Id;
		this.type = type;
	}
	public Screen() {
		super();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Id, movie, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Screen other = (Screen) obj;
		return Id == other.Id && Objects.equals(movie, other.movie) && Objects.equals(type, other.type);
	}
	
}
