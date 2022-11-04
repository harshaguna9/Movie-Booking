package com.moviebookingspring.moviebooking.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String name;
	private String pwd;
	
	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	@OneToMany(cascade=CascadeType.ALL)
	private List<PVR> pvr;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Inox> inox;
	
	public List<Inox> getInox() {
		return inox;
	}
	public void setInox(List<Inox> inox) {
		this.inox = inox;
	}
	public List<PVR> getPvr() {
		return pvr;
	}
	public void setPvr(List<PVR> pvr) {
		this.pvr = pvr;
	}
	public User() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, inox, name, pvr, pwd);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id && Objects.equals(inox, other.inox) && Objects.equals(name, other.name)
				&& Objects.equals(pvr, other.pvr) && Objects.equals(pwd, other.pwd);
	}
	
			
}
