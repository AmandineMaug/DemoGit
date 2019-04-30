package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Laboratoire implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idLaboratoire;
	private String nomLaboratoire;
	private int nbOrdi;
	@OneToMany(mappedBy="labo")
	private List<Epreuve> liste_epreuve;
	
	
	
	public List<Epreuve> getListe_epreuve() {
		return liste_epreuve;
	}
	public void setListe_epreuve(List<Epreuve> liste_epreuve) {
		this.liste_epreuve = liste_epreuve;
	}
	public long getIdLaboratoire() {
		return idLaboratoire;
	}
	public void setIdLaboratoire(long idLaboratoire) {
		this.idLaboratoire = idLaboratoire;
	}
	public String getNomLaboratoire() {
		return nomLaboratoire;
	}
	public void setNomLaboratoire(String nomLaboratoire) {
		this.nomLaboratoire = nomLaboratoire;
	}
	public int getNbOrdi() {
		return nbOrdi;
	}
	public void setNbOrdi(int nbOrdi) {
		this.nbOrdi = nbOrdi;
	}
	@Override
	public String toString() {
		return "Laboratoire [idLaboratoire=" + idLaboratoire + ", nomLaboratoire=" + nomLaboratoire + ", nbOrdi="
				+ nbOrdi + "]";
	}
	public Laboratoire(String nomLaboratoire, int nbOrdi) {
		super();
		this.nomLaboratoire = nomLaboratoire;
		this.nbOrdi = nbOrdi;
	}
	
	
	

}
