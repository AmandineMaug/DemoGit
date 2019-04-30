package com.example.demo.service;

import java.util.List;


import com.example.demo.entities.Laboratoire;



public interface IserviceLaboratoire{

	Laboratoire findOneById(Long id);
	Laboratoire save(Laboratoire p);
	void delete(Laboratoire p);
	List<Laboratoire> getAll();
}
