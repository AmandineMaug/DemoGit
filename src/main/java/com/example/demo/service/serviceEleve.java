package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IdaoEleve;
import com.example.demo.entities.Eleve;


@Service
public class serviceEleve implements IserviceEleve {

	@Autowired
	IdaoEleve daoEleve;

	@Override
	public Eleve findOneById(Long id) {
		// TODO Auto-generated method stub
		return daoEleve.getOne(id);
	}

	@Override
	public Eleve save(Eleve p) {
		// TODO Auto-generated method stub
		return daoEleve.save(p);
	}

	@Override
	public void delete(Eleve p) {
		// TODO Auto-generated method stub
		daoEleve.delete(p);
	}

	@Override
	public List<Eleve> getAll() {
		// TODO Auto-generated method stub
		return daoEleve.findAll();
	}

	@Override
	public List<Eleve> findBynomEleve(String nom) {
		// TODO Auto-generated method stub
		return daoEleve.findBynomEleve(nom);
	}

	@Override
	public List<Eleve> findByPrenomEleve(String prenom) {
		// TODO Auto-generated method stub
		return daoEleve.findByPrenomEleve(prenom);
	}

	
	

	
	
}
