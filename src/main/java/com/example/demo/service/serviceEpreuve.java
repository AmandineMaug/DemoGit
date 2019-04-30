package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.demo.dao.IdaoEpreuve;
import com.example.demo.dao.IdaoEpreuve;
import com.example.demo.entities.Epreuve;

public class serviceEpreuve implements IserviceEpreuve {

	
	@Autowired
	IdaoEpreuve daoEpreuve;

	@Override
	public Epreuve findOneById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Epreuve save(Epreuve p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Epreuve p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Epreuve> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
}
