package br.com.palpiteiros.api.consume.model;

import lombok.Data;

/*Representação da Classe fase da API Futebol*/

@Data
public class Fase {
	private Long fase_id;
	private Edicao edicao;
	private Campeonato campeonato;
}
