package com.example.demo.service;



import java.util.List;

import com.example.demo.dao.IdaoEleve;
import com.example.demo.dao.IdaoSection;
import com.example.demo.entities.Eleve;
import com.example.demo.entities.Section;


public interface IserviceEleve{
	Eleve findOneById(Long id);
	Eleve save(Eleve p);
	void delete(Eleve p);
	List<Eleve> getAll();
	
	List<Eleve> findBynomEleve(String nom);
	List<Eleve> findByPrenomEleve(String prenom);

	
}
