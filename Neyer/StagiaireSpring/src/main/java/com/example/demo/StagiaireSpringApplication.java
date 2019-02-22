package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StagiaireSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StagiaireSpringApplication.class, args);
		
		Stagiaire g1 = new Stagiaire("MAX","Mad","ABCDER");
		
		System.out.println(g1.nom);
		
	}
}
