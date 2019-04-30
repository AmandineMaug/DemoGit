package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Matiere implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMatiere;
	private String libelleMatiere;
	private float duree;
	private int coeff;
	
	@ManyToOne
	private Section section;
	
	@OneToMany(mappedBy="matiere")
	private List<Epreuve> liste_epreuveMat;
	
	

	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public int getIdMatiere() {
		return idMatiere;
	}
	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}
	public String getLibelleMatiere() {
		return libelleMatiere;
	}
	public void setLibelleMatiere(String libelleMatiere) {
		this.libelleMatiere = libelleMatiere;
	}
	public float getDuree() {
		return duree;
	}
	public void setDuree(float duree) {
		this.duree = duree;
	}
	public int getCoeff() {
		return coeff;
	}
	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}
	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", libelleMatiere=" + libelleMatiere + ", duree=" + duree
				+ ", coeff=" + coeff + "]";
	}
	public Matiere(String libelleMatiere, float duree, int coeff) {
		super();
		this.libelleMatiere = libelleMatiere;
		this.duree = duree;
		this.coeff = coeff;
	}
	
	

}
