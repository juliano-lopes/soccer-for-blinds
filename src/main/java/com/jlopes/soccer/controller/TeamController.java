package com.jlopes.soccer.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	@RequestMapping(value = "/team")
	public String listTeam() {

		String text = "<h1>Futebol de 5</h1>" + "<h2>Equipes</h2>" + "<ul>"
				+ "<li>ICB</li>" + "<li>AMC</li>" + "<li>CEIBC</li>"
				+ "<li>Urece</li>" + "</ul>"
				+ "<p><a href='/home'>Voltar para página inicial</a></p>";
		JSONObject team = new JSONObject();
		team.put("team", text);

		return team.toString();
	}
}
