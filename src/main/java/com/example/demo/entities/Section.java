package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Section implements Serializable {

	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSection;
	private String libelleMatiere;
	@OneToMany(mappedBy="section")
	private List<Eleve> liste_eleve;
	@OneToMany(mappedBy="section")
	private List<Matiere> liste_matiere;
	
	
	
	public List<Matiere> getListe_matiere() {
		return liste_matiere;
	}
	public void setListe_matiere(List<Matiere> liste_matiere) {
		this.liste_matiere = liste_matiere;
	}
	public String getLibelleMatiere() {
		return libelleMatiere;
	}
	public void setLibelleMatiere(String libelleMatiere) {
		this.libelleMatiere = libelleMatiere;
	}
	public List<Eleve> getListe_eleve() {
		return liste_eleve;
	}
	public void setListe_eleve(List<Eleve> liste_eleve) {
		this.liste_eleve = liste_eleve;
	}
	public int getIdSection() {
		return idSection;
	}
	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}
	public String getLibelle() {
		return libelleMatiere;
	}
	public void setLibelle(String libelle) {
		this.libelleMatiere = libelle;
	}
	
	public Section() {}
	public Section(String libelleMatiere, List<Eleve> liste_eleve) {
		super();
		this.libelleMatiere = libelleMatiere;
		this.liste_eleve = liste_eleve;
	}
	@Override
	public String toString() {
		return "Section [idSection=" + idSection + ", libelleMatiere=" + libelleMatiere + ", liste_eleve=" + liste_eleve
				+ "]";
	}

	
	
	
	
}
