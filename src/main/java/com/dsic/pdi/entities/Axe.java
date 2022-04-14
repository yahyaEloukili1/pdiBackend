package com.dsic.pdi.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Axe {

	@Id
	@GeneratedValue
	private int id;
	
	private String axe;
	private String axe_ar;
	@OneToMany(mappedBy = "axe",cascade = CascadeType.ALL)
	private Collection<Secteur> secteurs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAxe() {
		return axe;
	}
	public void setAxe(String axe) {
		this.axe = axe;
	}
	public String getAxe_ar() {
		return axe_ar;
	}
	public void setAxe_ar(String axe_ar) {
		this.axe_ar = axe_ar;
	}
	public Collection<Secteur> getSecteurs() {
		return secteurs;
	}
	public void setSecteurs(Collection<Secteur> secteurs) {
		this.secteurs = secteurs;
	}
	public Axe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Axe(String axe, String axe_ar) {
		super();
		this.axe = axe;
		this.axe_ar = axe_ar;
	}
	
	
	
}
