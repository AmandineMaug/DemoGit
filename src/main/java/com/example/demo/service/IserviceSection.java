package com.example.demo.service;

import java.util.List;


import com.example.demo.entities.Section;


public interface IserviceSection{
	Section findOneById(Long id);
	Section save(Section p);
	void delete(Section p);
	List<Section> getAll();
}
