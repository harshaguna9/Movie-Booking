package com.moviebookingspring.moviebooking.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Inox implements CinemaIf{
	
	@Id
	private long Id;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@OneToMany(cascade=CascadeType.ALL)
	private List<Screen> screens;
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	public List<Screen> getScreens() {
		return screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, screens);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inox other = (Inox) obj;
		return Id == other.Id && Objects.equals(screens, other.screens);
	}

	public Inox() {
		super();
	}
}
