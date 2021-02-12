package br.com.palpiteiros.api.consume.model;

import lombok.Data;

/*Representação da Classe RodadaAtual da API Futebol*/

@Data
public class RodadaAtual {
	private String nome;
	private Integer rodada;
	private String status;
}
