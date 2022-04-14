package com.dsic.pdi.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Secteur {

	@Id
	@GeneratedValue
	private int id;
	
	private String secteur;
	private String secteur_ar;
	
	@ManyToOne
	 @JoinColumn(name="axe_id")
	private Axe axe;
	
	
	@OneToMany(mappedBy = "projet",cascade = CascadeType.ALL)
	private Collection<Projet> projet;


	public String getSecteur() {
		return secteur;
	}


	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}


	public String getSecteur_ar() {
		return secteur_ar;
	}


	public void setSecteur_ar(String secteur_ar) {
		this.secteur_ar = secteur_ar;
	}


	public Axe getAxe() {
		return axe;
	}


	public void setAxe(Axe axe) {
		this.axe = axe;
	}


	public Collection<Projet> getProjet() {
		return projet;
	}


	public void setProjet(Collection<Projet> projet) {
		this.projet = projet;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Secteur(String secteur, String secteur_ar, Axe axe, Collection<Projet> projet) {
		super();
		this.secteur = secteur;
		this.secteur_ar = secteur_ar;
		this.axe = axe;
		this.projet = projet;
	}


	public Secteur() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
