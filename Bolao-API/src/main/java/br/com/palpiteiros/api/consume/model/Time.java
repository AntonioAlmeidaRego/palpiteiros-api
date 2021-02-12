package br.com.palpiteiros.api.consume.model;

import lombok.Data;

/*Representação da Classe Time da API Futebol*/

@Data
public class Time {
	private Long time_id;
	private String nome;
	private String nome_popular;
	private String sigla;
	private String apelido;

	@Override
	public String toString() {
		return "Team [id=" + time_id + ", nome=" + nome + ", nomePopular=" + nome_popular + ", sigla=" + sigla
				+ ", apelido=" + apelido + "]";
	}

}
