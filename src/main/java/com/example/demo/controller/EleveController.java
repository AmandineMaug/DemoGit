package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Eleve;
import com.example.demo.service.IserviceEleve;

/**
 * @author IN-NN-007
 *
 */
@RestController
public class EleveController {
	
	@Autowired
	IserviceEleve service;
	
	
	@GetMapping("/api/get/{id}")
	public Eleve findOneById(@PathVariable Long id) {
		return service.findOneById(id);
	}
	
	@PostMapping("/api/save")
	public Eleve save(@RequestBody Eleve e) {
		return service.save(e);
	}
	
	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Eleve e) {
		service.delete(e);
	}
	
	@GetMapping("/api/getall")
	public List<Eleve> findAll() {
		return service.getAll();
	}
	
}
