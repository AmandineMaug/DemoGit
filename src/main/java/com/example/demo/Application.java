package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.example.demo.entities.Eleve;
import com.example.demo.service.IserviceEleve;
import com.example.demo.service.serviceEleve;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringBootApplication.class, args);
		
		serviceEleve serviceEleveMain = ctx.getBean(com.example.demo.service.serviceEleve.class);
		
		Eleve e1= new Eleve("Bibi", "Baba", null, null,null);
		serviceEleveMain.save(e1);
		
		
	}

	
	
}
