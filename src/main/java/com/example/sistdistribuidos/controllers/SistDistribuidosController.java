package com.example.sistdistribuidos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SistDistribuidosController {
	
	@GetMapping("/hello")
	public String saludo() {
		return "Hola mundo";
	}
	
	@GetMapping("/sumar")
	public String sumar(@RequestParam float a, @RequestParam float b) {
		String resultado = Float.toString(a + b);
		return "El resultado es: " + resultado;
	}
	
	@GetMapping("/restar")
	public String restar(@RequestParam float a, @RequestParam float b) {
		String resultado = Float.toString(a - b);
		return "El resultado es: " + resultado;
	}
}
