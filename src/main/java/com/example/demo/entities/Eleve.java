package com.example.demo.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Eleve implements Serializable {
	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEleve;
	private String nomEleve;
	private String prenomEleve;
	private Date date;
	@ManyToOne
	private Section section;
	@ManyToMany
	private List<Epreuve> liste_epreuve;
	
	

	public List<Epreuve> getListe_epreuve() {
		return liste_epreuve;
	}
	public void setListe_epreuve(List<Epreuve> liste_epreuve) {
		this.liste_epreuve = liste_epreuve;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public int getIdEleve() {
		return idEleve;
	}
	public void setIdEleve(int idEleve) {
		this.idEleve = idEleve;
	}
	public String getNomEleve() {
		return nomEleve;
	}
	public void setNomEleve(String nomEleve) {
		this.nomEleve = nomEleve;
	}
	public String getPrenomEleve() {
		return prenomEleve;
	}
	public void setPrenomEleve(String prenomEleve) {
		this.prenomEleve = prenomEleve;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Eleve [idEleve=" + idEleve + ", nomEleve=" + nomEleve + ", prenomEleve=" + prenomEleve + ", date="
				+ date + ", section=" + section + ", liste_epreuve=" + liste_epreuve + "]";
	}
	
	public Eleve() {}
	public Eleve(String nomEleve, String prenomEleve, Date date, Section section, List<Epreuve> liste_epreuve) {
		super();
		this.nomEleve = nomEleve;
		this.prenomEleve = prenomEleve;
		this.date = date;
		this.section = section;
		this.liste_epreuve = liste_epreuve;
	}



	
	
	

}
