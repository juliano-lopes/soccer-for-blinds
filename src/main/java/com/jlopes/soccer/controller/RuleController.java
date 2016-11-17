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
				+ "<p>De modo geral, s�o as mesmas utilizadas no futebol de sal�o convencional."
				+ " Algumas daquelas que diferem s�o: dois tempos de 25 minutos, sendo os dois �ltimos de cada tempo cronometrados e um intervalo de dez minutos; uma pequena �rea de onde o goleiro n�o pode sair para realizar defesa nem pegar na bola de 5 por 2 metros; ap�s a terceira falta, � cobrado um tiro livre da linha de oito metros ou do local onde foi sofrida a falta."
				+ "Ao contr�rio do que se imagina, a modalidade tem muitas jogadas pl�sticas, com jogadas de efeito inclusive. Muitos toques e chutes a gol. Os jogadores s�o obrigados a falar a palavra espanhola 'voy' ('vou' em portugu�s), sempre que se deslocarem em dire��o a bola, na tentativa de se evitar choques. Quando o juiz n�o ouvir, ele marca falta contra a equipe cujo jogador n�o disse o 'voy'.</p>"
				+ "<p><a href='/home'>Voltar para p�gina inicial</a></p>";
		JSONObject rule = new JSONObject();
		rule.put("rule", text);
		return rule.toString();
	}
}
