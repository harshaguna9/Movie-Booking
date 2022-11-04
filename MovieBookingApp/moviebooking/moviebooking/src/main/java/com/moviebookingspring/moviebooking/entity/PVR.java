package com.moviebookingspring.moviebooking.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PVR implements CinemaIf{
	
	@Id
	private long id;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	private User user;
	
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	@OneToMany(cascade=CascadeType.ALL)
	private List<Screen> screens;
	
	public PVR() {
		super();
	}
	public PVR(long id) {
		super();
		this.id = id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Screen> getScreens() {
		return screens;
	}
	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, screens);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PVR other = (PVR) obj;
		return id == other.id && Objects.equals(screens, other.screens);
	}
	
}
