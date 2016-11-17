package com.jlopes.soccer.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuleController {
	@RequestMapping(value = "/rule")
	public String rule() {
		String text = "<h1>Futebol de 5</h1>"
				+ "<h2>Regras</h2>"
				+ "<p>De modo geral, são as mesmas utilizadas no futebol de salão convencional."
				+ " Algumas daquelas que diferem são: dois tempos de 25 minutos, sendo os dois últimos de cada tempo cronometrados e um intervalo de dez minutos; uma pequena área de onde o goleiro não pode sair para realizar defesa nem pegar na bola de 5 por 2 metros; após a terceira falta, é cobrado um tiro livre da linha de oito metros ou do local onde foi sofrida a falta."
				+ "Ao contrário do que se imagina, a modalidade tem muitas jogadas plásticas, com jogadas de efeito inclusive. Muitos toques e chutes a gol. Os jogadores são obrigados a falar a palavra espanhola 'voy' ('vou' em português), sempre que se deslocarem em direção a bola, na tentativa de se evitar choques. Quando o juiz não ouvir, ele marca falta contra a equipe cujo jogador não disse o 'voy'.</p>"
				+ "<p><a href='/home'>Voltar para página inicial</a></p>";
		JSONObject rule = new JSONObject();
		rule.put("rule", text);
		return rule.toString();
	}
}
