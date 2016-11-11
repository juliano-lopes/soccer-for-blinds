package com.jlopes.soccer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoryController {
	@RequestMapping(value = "/history")
	public String history() {
		String text = "<h1>Futebol de 5</h1>"
				+ "<h2>Hist�ria</h2>"
				+ "<p>Existem relatos que no Brasil, na d�cada de 50, cegos jogavam futebol com latas ou garrafas, mais tarde, com bolas envolvidas em sacolas pl�sticas, nas institui��es de ensino e de apoio a estes indiv�duos, como o Instituto Benjamin Constant, no Rio de Janeiro, Instituto Padre Chico, em S�o Paulo, Instituto S�o Rafael, em Belo Horizonte. Em 1978, nas Olimp�adas das APAEs, em Natal, aconteceu o primeiro campeonato de futebol com jogadores deficientes visuais no Brasil. A primeira Copa Brasil foi em 1984, na capital paulista. Contudo, o IPC - Comit� Paral�mpico Internacional reconhece como primeiro campeonato entre clubes, o acontecido na Espanha, em 1986."
				+ "Na Am�rica do Sul, apesar da realiza��o de alguns torneios anteriores, o primeiro reconhecido e organizado pela IBSA foi a Copa Am�rica de Assun��o, em 1997, onde o Brasil foi o grande campe�o. Participaram quatro sele��es: Brasil, Argentina, Col�mbia e Paraguai."
				+ "O primeiro mundial aconteceu no Brasil, em 1998, em Paul�nia, S�o Paulo. O Brasil foi o primeiro campe�o mundial, vencendo a Argentina na final."
				+ "A participa��o do Futebol de 5 nos Jogos Paral�mpicos aconteceu, pela primeira vez, em Atenas, 2004. Tamb�m, neste evento, o Brasil foi o campe�o, ao superar, nos p�naltis, os argentinos por 3 a 2. A Sele��o Canarinho possui mais dois t�tulos paral�mpicos: em Pequim-2008, e o �ltimo, em Londres-2012, onde o Brasil sagrou-se tricampe�o.Al�m dos t�tulos, a Sele��o Brasileira foi a primeira equipe a marcar um gol em Jogos Paral�mpicos. O autor do feito foi o atleta Nilson Silva, falecido em 2012."
				+ "Como � praticado"
				+ " O futebol de 5 � exclusivo para cegos. As partidas normalmente s�o em uma quadra de futsal adaptada com uma banda lateral (barreira feita de placas de madeira que se prolonga de uma linha de fundo � outra, com um metro e meio de altura, em ambos os lados da quadra, evitando que a bola saia em lateral, a n�o ser que seja por cima desta), mas desde os Jogos Paral�mpicos de Atenas tamb�m vem sendo praticado em campos de grama sint�tica, com as mesmas medidas e regras do futebol de sal�o."
				+ " Cada time � formado por cinco jogadores: um goleiro, que tem vis�o total e quatro na linha, totalmente cegos e que usam uma venda nos olhos para deix�-los todos em iguais condi��es, j� que alguns atletas possuem um res�duo visual (vulto) que d�o, nesta modalidade, alguma vantagem a estes."
				+ " H� ainda um guia, o Chamador, que fica atr�s do gol advers�rio orientando o ataque de seu time, dando a seus atletas a dire��o do gol, a quantidade de marcadores, a posi��o da defesa advers�ria, as possibilidades de jogada e demais informa��es �teis. � o chamador que bate nas traves, normalmente com uma base de metal, quando vai ser cobrada uma falta, um p�nalti ou um tiro livre."
				+ "Contudo, o chamador n�o pode falar em qualquer ponto da quadra, e sim, quando seu atleta estiver no ter�o de ataque. Este ter�o � determinado por uma fita (marca��o) que � colocada na banda lateral, dividindo a quadra em tr�s partes: o ter�o da defesa, onde o goleiro tem a responsabilidade de orientar; o ter�o central, onde a responsabilidade � do t�cnico e o ter�o de ataque, onde a responsabilidade da orienta��o � do chamador."
				+ "A modalidade, ao contr�rio do futebol convencional, deve ser praticada em um ambiente silencioso. A torcida, bastante desejada nesta modalidade, deve se manifestar somente quando a bola estiver fora do jogo: na hora do gol, em faltas, linha de fundo, lateral, tempo t�cnico ou qualquer outra paraliza��o da partida."
				+ "A bola possui guizos, necess�rios para a orienta��o dos jogadores dentro de quadra. Da� a necessidade do sil�ncio durante o andamento da partida. Atrav�s do som emitido pelos guizos, os jogadores podem identificar onde ela est�, de onde ela est� vindo e podem conduzi-la."
				+ "No Brasil, o futebol � gerido pela Confedera��o Brasileira de Desportos de Deficientes Visuais - CBDV; internacionalmente, a gest�o cabe a Federa��o Internacional de Esportes para Cegos - IBSA (sigla em ingl�s)."
				+ "Atualmente, o esporte no Brasil � patrocinado pela Loterias Caixa.</p>"
				+ "<p><a href='/home'>Voltar para p�gina inicial</a></p>";
		return text;
	}

}
