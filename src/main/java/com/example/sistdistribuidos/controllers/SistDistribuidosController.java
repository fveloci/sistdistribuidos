package com.example.sistdistribuidos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SistDistribuidosController {
	
	@GetMapping("/hello")
	public String saludo() {
		return "Hola mundo";
	}
}
