package com.jlopes.soccer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoryController {
	@RequestMapping(value = "/history")
	public String history() {
		String text = "<h1>Futebol de 5</h1>"
				+ "<h2>História</h2>"
				+ "<p>Existem relatos que no Brasil, na década de 50, cegos jogavam futebol com latas ou garrafas, mais tarde, com bolas envolvidas em sacolas plásticas, nas instituições de ensino e de apoio a estes indivíduos, como o Instituto Benjamin Constant, no Rio de Janeiro, Instituto Padre Chico, em São Paulo, Instituto São Rafael, em Belo Horizonte. Em 1978, nas Olimpíadas das APAEs, em Natal, aconteceu o primeiro campeonato de futebol com jogadores deficientes visuais no Brasil. A primeira Copa Brasil foi em 1984, na capital paulista. Contudo, o IPC - Comitê Paralímpico Internacional reconhece como primeiro campeonato entre clubes, o acontecido na Espanha, em 1986."
				+ "Na América do Sul, apesar da realização de alguns torneios anteriores, o primeiro reconhecido e organizado pela IBSA foi a Copa América de Assunção, em 1997, onde o Brasil foi o grande campeão. Participaram quatro seleções: Brasil, Argentina, Colômbia e Paraguai."
				+ "O primeiro mundial aconteceu no Brasil, em 1998, em Paulínia, São Paulo. O Brasil foi o primeiro campeão mundial, vencendo a Argentina na final."
				+ "A participação do Futebol de 5 nos Jogos Paralímpicos aconteceu, pela primeira vez, em Atenas, 2004. Também, neste evento, o Brasil foi o campeão, ao superar, nos pênaltis, os argentinos por 3 a 2. A Seleção Canarinho possui mais dois títulos paralímpicos: em Pequim-2008, e o último, em Londres-2012, onde o Brasil sagrou-se tricampeão.Além dos títulos, a Seleção Brasileira foi a primeira equipe a marcar um gol em Jogos Paralímpicos. O autor do feito foi o atleta Nilson Silva, falecido em 2012."
				+ "Como é praticado"
				+ " O futebol de 5 é exclusivo para cegos. As partidas normalmente são em uma quadra de futsal adaptada com uma banda lateral (barreira feita de placas de madeira que se prolonga de uma linha de fundo à outra, com um metro e meio de altura, em ambos os lados da quadra, evitando que a bola saia em lateral, a não ser que seja por cima desta), mas desde os Jogos Paralímpicos de Atenas também vem sendo praticado em campos de grama sintética, com as mesmas medidas e regras do futebol de salão."
				+ " Cada time é formado por cinco jogadores: um goleiro, que tem visão total e quatro na linha, totalmente cegos e que usam uma venda nos olhos para deixá-los todos em iguais condições, já que alguns atletas possuem um resíduo visual (vulto) que dão, nesta modalidade, alguma vantagem a estes."
				+ " Há ainda um guia, o Chamador, que fica atrás do gol adversário orientando o ataque de seu time, dando a seus atletas a direção do gol, a quantidade de marcadores, a posição da defesa adversária, as possibilidades de jogada e demais informações úteis. É o chamador que bate nas traves, normalmente com uma base de metal, quando vai ser cobrada uma falta, um pênalti ou um tiro livre."
				+ "Contudo, o chamador não pode falar em qualquer ponto da quadra, e sim, quando seu atleta estiver no terço de ataque. Este terço é determinado por uma fita (marcação) que é colocada na banda lateral, dividindo a quadra em três partes: o terço da defesa, onde o goleiro tem a responsabilidade de orientar; o terço central, onde a responsabilidade é do técnico e o terço de ataque, onde a responsabilidade da orientação é do chamador."
				+ "A modalidade, ao contrário do futebol convencional, deve ser praticada em um ambiente silencioso. A torcida, bastante desejada nesta modalidade, deve se manifestar somente quando a bola estiver fora do jogo: na hora do gol, em faltas, linha de fundo, lateral, tempo técnico ou qualquer outra paralização da partida."
				+ "A bola possui guizos, necessários para a orientação dos jogadores dentro de quadra. Daí a necessidade do silêncio durante o andamento da partida. Através do som emitido pelos guizos, os jogadores podem identificar onde ela está, de onde ela está vindo e podem conduzi-la."
				+ "No Brasil, o futebol é gerido pela Confederação Brasileira de Desportos de Deficientes Visuais - CBDV; internacionalmente, a gestão cabe a Federação Internacional de Esportes para Cegos - IBSA (sigla em inglês)."
				+ "Atualmente, o esporte no Brasil é patrocinado pela Loterias Caixa.</p>"
				+ "<p><a href='/home'>Voltar para página inicial</a></p>";
		return text;
	}

}
