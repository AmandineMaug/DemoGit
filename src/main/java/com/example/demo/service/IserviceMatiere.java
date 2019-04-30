package com.example.demo.service;

import java.util.List;


import com.example.demo.entities.Matiere;


public interface IserviceMatiere{

	Matiere findOneById(Long id);
	Matiere save(Matiere p);
	void delete(Matiere p);
	List<Matiere> getAll();
}
