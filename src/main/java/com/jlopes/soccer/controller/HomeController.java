package com.jlopes.soccer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(value = "/home")
	public String home() {
		String text = "<h1>Bem vindo(a)!</h1>"
				+ "<p>Conheça um pouco mais sobre o futebol de 5.</p>" + "<ul>"
				+ "<li><a href='/history'>História</a></li>"
				+ "<li><a href='/rule'>Regras</a></li>"
				+ "<li><a href='/team'>Equipes</a></li>" + "</ul>";

		return text;

	}

}
