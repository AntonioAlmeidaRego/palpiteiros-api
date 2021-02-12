package br.com.palpiteiros.api.consume.model;

import lombok.Data;

/*Representação da Classe Edicao da API Futebol*/

@Data
public class Edicao {
	private Long edicao_id;
	private String temporada;
	private String nome;
	private String nome_popular;
}
