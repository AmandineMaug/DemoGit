package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Epreuve implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idEpreuve;
	private Date dateEpreuve;
	@ManyToMany
	@JoinColumn(name="")
	private List<Eleve> liste_eleve;
	@ManyToOne
	private Laboratoire labo;
	@ManyToOne
	private Matiere matiere;
	
	
	
	public Laboratoire getLabo() {
		return labo;
	}
	public void setLabo(Laboratoire labo) {
		this.labo = labo;
	}
	public List<Eleve> getListe_eleve() {
		return liste_eleve;
	}
	public void setListe_eleve(List<Eleve> liste_eleve) {
		this.liste_eleve = liste_eleve;
	}
	public long getIdEpreuve() {
		return idEpreuve;
	}
	public void setIdEpreuve(long idEpreuve) {
		this.idEpreuve = idEpreuve;
	}
	public Date getDateEpreuve() {
		return dateEpreuve;
	}
	public void setDateEpreuve(Date dateEpreuve) {
		this.dateEpreuve = dateEpreuve;
	}
	@Override
	public String toString() {
		return "Epreuve [idEpreuve=" + idEpreuve + ", dateEpreuve=" + dateEpreuve + "]";
	}
	public Epreuve( Date dateEpreuve) {

		this.dateEpreuve = dateEpreuve;
	}
	
	
	

}
