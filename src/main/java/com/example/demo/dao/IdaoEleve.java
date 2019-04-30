package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Eleve;

@Repository
public interface IdaoEleve extends JpaRepository<Eleve, Long> {
	List<Eleve> findBynomEleve(String nom);
	List<Eleve> findByPrenomEleve(String prenom);
	
	

}
