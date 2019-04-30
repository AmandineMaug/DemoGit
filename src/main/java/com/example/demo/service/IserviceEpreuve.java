package com.example.demo.service;

import java.util.List;


import com.example.demo.entities.Epreuve;


public interface IserviceEpreuve{

	Epreuve findOneById(Long id);
	Epreuve save(Epreuve p);
	void delete(Epreuve p);
	List<Epreuve> getAll();
}
