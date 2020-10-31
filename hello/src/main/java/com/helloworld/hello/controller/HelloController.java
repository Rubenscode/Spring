package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HelloController {
	
	@GetMapping("/hello")	
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/mentalidade")
	public String mentalidadeHabilidade() {
		return "Mentalidade de Crescimento\nHabilidade: Orientação ao Detalhe";
	}
	
	@GetMapping("/objetivo")
	public String objetivoAprendizagem() {
		return "Arquiterura REST e RESTfull,\nHTTP: Status e Métodos Get, Post, Put e Delete\nCamadas Spring MVC - Model, View e Controller\nUsar Spring - Hello World";
	}

}
