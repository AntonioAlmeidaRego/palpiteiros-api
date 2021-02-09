package br.com.palpiteiros.api.enums;

import lombok.Getter;

@Getter
public enum ChampionshipType {
	RACING_POINTS_CHAMPIONSHIP("Campeonato de pontos corridos"),
	ELIMINATORY_PHASE("Fase Emininatória");
	
	private String value;
	
	private ChampionshipType(String value) {
		this.value = value;
	}
}