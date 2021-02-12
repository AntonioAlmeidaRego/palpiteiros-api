package br.com.palpiteiros.api.consume.model;

import lombok.Data;

/*Representação da Classe Campeonato da API Futebol*/

@Data
public class Campeonato {
	private Long campeonato_id;
	private String nome;
	private String nome_popular;
	private EdicaoAtual edicaoAtual;
	private FaseAtual faseAtual;
	private RodadaAtual rodadaAtual;
	private String tipo;
	private String status;
	private String logo;
}
