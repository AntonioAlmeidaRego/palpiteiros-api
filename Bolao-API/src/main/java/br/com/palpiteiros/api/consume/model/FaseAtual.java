package br.com.palpiteiros.api.consume.model;

import lombok.Data;

/*Representação da Classe FaseAtual da API Futebol*/

@Data
public class FaseAtual {
	private Long fase_id;
	private String nome;
	private String tipo;
}
