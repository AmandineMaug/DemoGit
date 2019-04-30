package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IdaoCRUD<T> extends JpaRepository<T, Long> {
	

}
